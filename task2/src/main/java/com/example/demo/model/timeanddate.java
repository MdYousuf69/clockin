package com.example.demo.model;

public class timeanddate {

	 String data;
	 String dates;
	 //Set<String> data = new LinkedHashSet<String>();    
	  // Set<String> dates = new LinkedHashSet<String>();
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDates() {
		return dates;
	}
	public void setDates(String dates) {
		this.dates = dates;
	}
	public timeanddate(String data, String dates) {
		super();
		this.data = data;
		this.dates = dates;
	}
	public timeanddate() {
		super();
	}
	@Override
	public String toString() {
		return "timeanddate [data=" + data + ", dates=" + dates + "]";
	}
	 
	 
	 
	 
	 
	 
	 
}
