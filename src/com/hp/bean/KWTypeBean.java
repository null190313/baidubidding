package com.hp.bean;

public class KWTypeBean {
	private Integer kwtid;
	private String kwttype;
	public Integer getKwtid() {
		return kwtid;
	}
	public void setKwtid(Integer kwtid) {
		this.kwtid = kwtid;
	}
	public String getKwttype() {
		return kwttype;
	}
	public void setKwttype(String kwttype) {
		this.kwttype = kwttype;
	}
	@Override
	public String toString() {
		return "KWTypeBean [kwtid=" + kwtid + ", kwttype=" + kwttype + "]";
	}
	
}
