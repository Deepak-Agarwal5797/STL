package com.phoenix.models;

public class Date implements Cloneable {

	public Date(int mm, int yy, int dd) {
		super();
		this.mm = mm;
		this.yy = yy;
		this.dd = dd;
	}
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}
	private int mm;
	private int yy;
	private int dd;
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getYy() {
		return yy;
	}
	public void setYy(int yy) {
		this.yy = yy;
	}
	public int getDd() {
		return dd;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	@Override
	public String toString() {
		return "Date [mm=" + mm + ", yy=" + yy + ", dd=" + dd + "]";
	}
	@Override
	  public Object clone() throws CloneNotSupportedException { 
		  
		  return super.clone();
	  
	  }
	
}
