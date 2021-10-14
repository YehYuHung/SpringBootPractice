package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class MemberAccount {
	private int ST_ID;
	private String TITLE;
	private String AUTHOR;
	private double PRICE;
	private String URL_ADDRESS;
	public int getST_ID() {
		return ST_ID;
	}
	public void setST_ID(int sT_ID) {
		this.ST_ID = sT_ID;
	}
	public String getTITLE() {
		return TITLE;
	}
	public void setTITLE(String tITLE) {
		this.TITLE = tITLE;
	}
	public String getAUTHOR() {
		return AUTHOR;
	}
	public void setAUTHOR(String aUTHOR) {
		this.AUTHOR = aUTHOR;
	}
	public String getURL_ADDRESS() {
		return URL_ADDRESS;
	}
	public void setURL_ADDRESS(String uRL_ADDRESS) {
		this.URL_ADDRESS = uRL_ADDRESS;
	}
	public double getPRICE() {
		return PRICE;
	}
	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}
}
