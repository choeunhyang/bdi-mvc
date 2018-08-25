package com.bdi.mvc.vo;

public class User {
	private int unum;
	private String uname;
	private String uid;
	private String upwd;
	private String udesc;
	private int uage;
	public User(int unum, String uname, String uid, String upwd, String udesc, int uage, int uno) {
		super();
		this.unum = unum;
		this.uname = uname;
		this.uid = uid;
		this.upwd = upwd;
		this.udesc = udesc;
		this.uage = uage;
	}
	public int getUnum() {
		return unum;
	}
	public void setUnum(int unum) {
		this.unum = unum;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUdesc() {
		return udesc;
	}
	public void setUdesc(String udesc) {
		this.udesc = udesc;
	}
	public int getUage() {
		return uage;
	}
	public void setUage(int uage) {
		this.uage = uage;
	}
	@Override
	public String toString() {
		return "User [unum=" + unum + ", uname=" + uname + ", uid=" + uid + ", upwd=" + upwd + ", udesc=" + udesc
				+ ", uage=" + uage + "]";
	}
}
