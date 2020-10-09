package tech.codingclub.helix.entity;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import tech.codingclub.helix.global.HttpURLConnectionExample;
import tech.codingclub.helix.utility.TaskManagerCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class YoutubeDownloader implements Callable {
    private String keyword;
    private String result;
    public YoutubeDownloader(){

    }

    public YoutubeDownloader(String keyword){
        this.keyword=keyword;
    }


    @Override
    public Object call() throws Exception {
        return null;
    }

    public WikiResult getResult(){
        if(this.keyword==null || this.keyword.length() ==0){
            return null;
        }
        this.keyword = this.keyword.trim().replaceAll("[ ]+","+");

        String youTubeUrl="https://www.youtube.com/results?search_query="+this.keyword;
        String imageUrl=null;
        String response="";
        try {
            String wikipediaResponseHTML= HttpURLConnectionExample.sendGet(youTubeUrl);
            //System.out.println(wikipediaResponseHTML);

            Document document= Jsoup.parse(wikipediaResponseHTML,"https://www.youtube.com");

            Elements childElements=document.body().select("#contents > *");

            int state=0;

            for(Element childElement:childElements){

                if(state == 0){
                    if(childElement.tagName().equals("table")){
                        state=1;
                    }}
                    else if(state==1){
                        if(childElement.tagName().equals("p")){
                            state = 2;
                            response=childElement.text();
                            break;
                        }
                    }


               // System.out.println(childElement.tagName());

            }
            imageUrl=document.body().select(".infobox img").get(0).attr("src");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        if(imageUrl.startsWith(("//"))){
//            imageUrl="https:"+imageUrl;
//        }

       WikiResult wikiResult=new WikiResult(this.keyword,response,imageUrl);

            return  wikiResult;




    }


    public static void main(String[] args) throws InterruptedException, ExecutionException {
        YoutubeDownloader ytd=new YoutubeDownloader("ps4");
        TaskManagerCallable tmc=new TaskManagerCallable(1);
        Future<String> fut=tmc.waitTillQueueIsFreeAndAddTask(ytd);
        System.out.println(fut.get());
    }



}
