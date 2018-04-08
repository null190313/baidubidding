package com.hp.bean;

import java.io.Serializable;

public class WebpageBean  implements Serializable{
	private Integer wid;
	private UserBean user; 
	private KWTypeBean type;
	private String wkeyword;
	private String wtitle;
	private String wurl;
	private String wabout;
	private double wbid;
	private Integer wclicks;
	private Integer wshowcount;
	private double wqualityscore;
	public Integer getWid() {
		return wid;
	}
	public void setWid(Integer wid) {
		this.wid = wid;
	}
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public KWTypeBean getType() {
		return type;
	}
	public void setType(KWTypeBean type) {
		this.type = type;
	}
	public String getWkeyword() {
		return wkeyword;
	}
	public void setWkeyword(String wkeyword) {
		this.wkeyword = wkeyword;
	}
	public String getWtitle() {
		return wtitle;
	}
	public void setWtitle(String wtitle) {
		this.wtitle = wtitle;
	}
	public String getWurl() {
		return wurl;
	}
	public void setWurl(String wurl) {
		this.wurl = wurl;
	}
	public String getWabout() {
		return wabout;
	}
	public void setWabout(String wabout) {
		this.wabout = wabout;
	}
	public double getWbid() {
		return wbid;
	}
	public void setWbid(double wbid) {
		this.wbid = wbid;
	}
	public Integer getWclicks() {
		return wclicks;
	}
	public void setWclicks(Integer wclicks) {
		this.wclicks = wclicks;
	}
	public Integer getWshowcount() {
		return wshowcount;
	}
	public void setWshowcount(Integer wshowcount) {
		this.wshowcount = wshowcount;
	}
	public double getWqualityscore() {
		return wqualityscore;
	}
	public void setWqualityscore(double wqualityscore) {
		this.wqualityscore = wqualityscore;
	}
	@Override
	public String toString() {
		return "WebpageBean [wid=" + wid + ", user=" + user + ", type=" + type + ", wkeyword=" + wkeyword + ", wtitle="
				+ wtitle + ", wurl=" + wurl + ", wabout=" + wabout + ", wbid=" + wbid + ", wclicks=" + wclicks
				+ ", wshowcount=" + wshowcount + ", wqualityscore=" + wqualityscore + "]";
	}
}
