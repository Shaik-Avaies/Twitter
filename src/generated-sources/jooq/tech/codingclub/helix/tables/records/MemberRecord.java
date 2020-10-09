/**
 * This class is generated by jOOQ
 */
package tech.codingclub.helix.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MemberRecord extends org.jooq.impl.UpdatableRecordImpl<tech.codingclub.helix.tables.records.MemberRecord> implements org.jooq.Record8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long> {

	private static final long serialVersionUID = 381663050;

	/**
	 * Setter for <code>public.member.name</code>.
	 */
	public void setName(java.lang.String value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.member.name</code>.
	 */
	public java.lang.String getName() {
		return (java.lang.String) getValue(0);
	}

	/**
	 * Setter for <code>public.member.email</code>.
	 */
	public void setEmail(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.member.email</code>.
	 */
	public java.lang.String getEmail() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.member.role</code>.
	 */
	public void setRole(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.member.role</code>.
	 */
	public java.lang.String getRole() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>public.member.password</code>.
	 */
	public void setPassword(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>public.member.password</code>.
	 */
	public java.lang.String getPassword() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>public.member.image</code>.
	 */
	public void setImage(java.lang.String value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>public.member.image</code>.
	 */
	public java.lang.String getImage() {
		return (java.lang.String) getValue(4);
	}

	/**
	 * Setter for <code>public.member.token</code>.
	 */
	public void setToken(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>public.member.token</code>.
	 */
	public java.lang.String getToken() {
		return (java.lang.String) getValue(5);
	}

	/**
	 * Setter for <code>public.member.is_verified</code>.
	 */
	public void setIsVerified(java.lang.Boolean value) {
		setValue(6, value);
	}

	/**
	 * Getter for <code>public.member.is_verified</code>.
	 */
	public java.lang.Boolean getIsVerified() {
		return (java.lang.Boolean) getValue(6);
	}

	/**
	 * Setter for <code>public.member.id</code>.
	 */
	public void setId(java.lang.Long value) {
		setValue(7, value);
	}

	/**
	 * Getter for <code>public.member.id</code>.
	 */
	public java.lang.Long getId() {
		return (java.lang.Long) getValue(7);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Long> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record8 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long> fieldsRow() {
		return (org.jooq.Row8) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row8<java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Long> valuesRow() {
		return (org.jooq.Row8) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field1() {
		return tech.codingclub.helix.tables.Member.MEMBER.NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return tech.codingclub.helix.tables.Member.MEMBER.EMAIL;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return tech.codingclub.helix.tables.Member.MEMBER.ROLE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return tech.codingclub.helix.tables.Member.MEMBER.PASSWORD;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field5() {
		return tech.codingclub.helix.tables.Member.MEMBER.IMAGE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return tech.codingclub.helix.tables.Member.MEMBER.TOKEN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Boolean> field7() {
		return tech.codingclub.helix.tables.Member.MEMBER.IS_VERIFIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Long> field8() {
		return tech.codingclub.helix.tables.Member.MEMBER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value1() {
		return getName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getEmail();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getRole();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getPassword();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value5() {
		return getImage();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getToken();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Boolean value7() {
		return getIsVerified();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Long value8() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value1(java.lang.String value) {
		setName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value2(java.lang.String value) {
		setEmail(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value3(java.lang.String value) {
		setRole(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value4(java.lang.String value) {
		setPassword(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value5(java.lang.String value) {
		setImage(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value6(java.lang.String value) {
		setToken(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value7(java.lang.Boolean value) {
		setIsVerified(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord value8(java.lang.Long value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public MemberRecord values(java.lang.String value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.String value5, java.lang.String value6, java.lang.Boolean value7, java.lang.Long value8) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached MemberRecord
	 */
	public MemberRecord() {
		super(tech.codingclub.helix.tables.Member.MEMBER);
	}

	/**
	 * Create a detached, initialised MemberRecord
	 */
	public MemberRecord(java.lang.String name, java.lang.String email, java.lang.String role, java.lang.String password, java.lang.String image, java.lang.String token, java.lang.Boolean isVerified, java.lang.Long id) {
		super(tech.codingclub.helix.tables.Member.MEMBER);

		setValue(0, name);
		setValue(1, email);
		setValue(2, role);
		setValue(3, password);
		setValue(4, image);
		setValue(5, token);
		setValue(6, isVerified);
		setValue(7, id);
	}
}
