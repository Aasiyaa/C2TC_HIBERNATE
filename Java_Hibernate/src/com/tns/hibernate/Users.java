package com.tns.hibernate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="student_data")//pass the name of the table 
public class Users 
{
	@Id
	@Column(name="user_id")//its referring to the database column name user_id//case sensitive
	int userid;
	
	@Column(name="user_name")
	String username;
	
	@Column(name="password")
	String password;
	
	@Column(name="first_name")
	String firstname;
	
	@Column(name="last_name")
	String lastname;

	public int getUserid() {
		return userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Users(int userid, String username, String password, String firstname, String lastname) {
		super();
		this.userid = userid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}

	public Users() {
		super();
	}

	@Override
	public String toString() {
		return "Users [userid=" + userid + ", username=" + username + ", password=" + password + ", firstname="
				+ firstname + ", lastname=" + lastname + "]";
	}
	
	 
	
}