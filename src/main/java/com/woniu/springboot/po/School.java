package com.woniu.springboot.po;

public class School {

	private String sname;
	private String address;
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(String sname, String adrress) {
		super();
		this.sname = sname;
		this.address = adrress;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAdrress() {
		return address;
	}
	public void setAdrress(String adrress) {
		this.address = adrress;
	}
	@Override
	public String toString() {
		return "School [sname=" + sname + ", adrress=" + address + "]";
	}
	
}
