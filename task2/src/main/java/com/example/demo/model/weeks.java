package com.example.demo.model;

public class weeks {

	int noofemploye;
	String days;
	public int getNoofemploye() {
		return noofemploye;
	}
	public void setNoofemploye(int noofemploye) {
		this.noofemploye = noofemploye;
	}
	public String getDays() {
		return days;
	}
	public void setDays(String days) {
		this.days = days;
	}
	@Override
	public String toString() {
		return "weeks [noofemploye=" + noofemploye + ", days=" + days + "]";
	}
	public weeks(int noofemploye, String days) {
		super();
		this.noofemploye = noofemploye;
		this.days = days;
	}
	public weeks() {
		super();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
