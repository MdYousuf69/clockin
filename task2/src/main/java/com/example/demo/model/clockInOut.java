package com.example.demo.model;

 
 
import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;
 
public class clockInOut {

    private String emplyeno;
    private String login;
    private String logout;
    private String hours;
   // private String sno;
         private    Date  from;
     private  Date to;
     @DateTimeFormat
     private String timeout;
      private  String timein;

    private String comments;

 

	public String getEmplyeno() {
		return emplyeno;
	}

	public void setEmplyeno(String emplyeno) {
		this.emplyeno = emplyeno;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogout() {
		return logout;
	}

	public void setLogout(String logout) {
		this.logout = logout;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
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

	public String getTimeout() {
		return timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

	public String getTimein() {
		return timein;
	}

	public void setTimein(String timein) {
		this.timein = timein;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

 

 

	@Override
	public String toString() {
		return "clockInOut [emplyeno=" + emplyeno + ", login=" + login + ", logout=" + logout + ", hours=" + hours
				+ ", from=" + from + ", to=" + to + ", timeout=" + timeout + ", timein=" + timein + ", comments="
				+ comments + "]";
	}

	public clockInOut() {
		super();
	}

	public clockInOut(String emplyeno, String login, String logout, String hours, Date from, Date to, String timeout,
			String timein, String comments) {
		super();
		this.emplyeno = emplyeno;
		this.login = login;
		this.logout = logout;
		this.hours = hours;
		this.from = from;
		this.to = to;
		this.timeout = timeout;
		this.timein = timein;
		this.comments = comments;
	}

	 
	 

	 
	 
	 
	 
  
	 
 
 
 
	 
	
	 
	
	 
    
    
    
    
    
    
    
    
    

}
