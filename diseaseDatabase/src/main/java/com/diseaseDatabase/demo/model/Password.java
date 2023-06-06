package com.diseaseDatabase.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Password {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int userid;
	private String uname;
	private String newpassword;
	private String confirmpassword;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getConfirmpassword() {
		return confirmpassword;
	}
	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}
	public Password() {
		super();
	}
	@Override
	public String toString() {
		return "Password [userid=" + userid + ", uname=" + uname + ", newpassword=" + newpassword + ", confirmpassword="
				+ confirmpassword + "]";
	}
	


}
