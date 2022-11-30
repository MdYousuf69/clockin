package com.example.demo.controller;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class clock {
	private String emplyeNo;
	private LocalDateTime loginIn;
	private LocalDateTime logOut;
	private LocalTime hours;
	private String sno;
	private String comments;
	private Date from;
	private Date to;
	public String getEmplyeNo() {
		return emplyeNo;
	}
	public void setEmplyeNo(String emplyeNo) {
		this.emplyeNo = emplyeNo;
	}
	 
	public LocalDateTime getLoginIn() {
		return loginIn;
	}
	public void setLoginIn(LocalDateTime loginIn) {
		this.loginIn = loginIn;
	}
	public LocalDateTime getLogOut() {
		return logOut;
	}
	public void setLogOut(LocalDateTime logOut) {
		this.logOut = logOut;
	}
	public LocalTime getHours() {
		return hours;
	}
	public void setHours(LocalTime hours) {
		this.hours = hours;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public Date getFrom() {
		return from;
	}
	public void setFrom(Date from) {
		this.from = from;
	}
	public Date getTo() {
		return to;
	}
	public void setTo(Date to) {
		this.to = to;
	}
	 
	public clock() {
		super();
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
 
	
	
	
	
	
	
	
	
}
