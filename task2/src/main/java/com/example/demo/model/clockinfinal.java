package com.example.demo.model;

 
 
import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity(name = "clockinfinal")
public class clockinfinal {
	   @Id
	    @GeneratedValue
	    private long id;
    private long emplyeno;
    private Date login;
    private Date logout;
    private String hours;
    private Time logintime;

    private Time logouttime;

    private String comments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	 

	public Date getLogin() {
		return login;
	}

	public void setLogin(Date login) {
		this.login = login;
	}

	public Date getLogout() {
		return logout;
	}

	public void setLogout(Date logout) {
		this.logout = logout;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	 
	public Time getLogintime() {
		return logintime;
	}

	public void setLogintime(Time logintime) {
		this.logintime = logintime;
	}

	public Time getLogouttime() {
		return logouttime;
	}

	public void setLogouttime(Time logouttime) {
		this.logouttime = logouttime;
	}

	public clockinfinal() {
		super();
	}

	public long getEmplyeno() {
		return emplyeno;
	}

	public void setEmplyeno(long emplyeno) {
		this.emplyeno = emplyeno;
	}

	@Override
	public String toString() {
		return "clockinfinal [id=" + id + ", emplyeno=" + emplyeno + ", login=" + login + ", logout=" + logout
				+ ", hours=" + hours + ", logintime=" + logintime + ", logouttime=" + logouttime + ", comments="
				+ comments + "]";
	}

	public clockinfinal(long id, long emplyeno, Date login, Date logout, String hours, Time logintime, Time logouttime,
			String comments) {
		super();
		this.id = id;
		this.emplyeno = emplyeno;
		this.login = login;
		this.logout = logout;
		this.hours = hours;
		this.logintime = logintime;
		this.logouttime = logouttime;
		this.comments = comments;
	}

 
	
	 
	
	 
    
    
    
    
    
    
    
    
    

}
