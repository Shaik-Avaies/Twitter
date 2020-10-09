<html>
<head>
    <script type="text/javascript">
        function myfunction(){
        location.href="localhost:8080/song/api?"+document.getElementById("name");
        }
    </script>
</head>
<body>
<form action="javascript:myfunction()">
<input type="text" id="name">
<input type="submit" value="Submit">
</form>
</body>
</html>

