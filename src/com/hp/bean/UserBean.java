package com.hp.bean;

import java.io.Serializable;

public class UserBean  implements Serializable{
	private Integer uid;
	private String uname;
	private String upwd;
	private String ueamil;
	private String ucompany;
	private String utfn;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUeamil() {
		return ueamil;
	}
	public void setUeamil(String ueamil) {
		this.ueamil = ueamil;
	}
	public String getUcompany() {
		return ucompany;
	}
	public void setUcompany(String ucompany) {
		this.ucompany = ucompany;
	}
	public String getUtfn() {
		return utfn;
	}
	public void setUtfn(String utfn) {
		this.utfn = utfn;
	}
	@Override
	public String toString() {
		return "UserBean [uid=" + uid + ", uname=" + uname + ", upwd=" + upwd + ", ueamil=" + ueamil + ", ucompany="
				+ ucompany + ", utfn=" + utfn + "]";
	}
}
