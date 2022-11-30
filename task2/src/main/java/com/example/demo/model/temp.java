package com.example.demo.model;

 
 
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Table
@Entity(name = "temp")
public class temp {
	   @Id
	    @GeneratedValue
	    private long id;
    private String emplyeno;
    private String login;
    private String logout;
    private String hours;
 
    private String comments;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "clockinfinal [id=" + id + ", emplyeno=" + emplyeno + ", login=" + login + ", logout=" + logout
				+ ", hours=" + hours + ", comments=" + comments + "]";
	}

	public temp(long id, String emplyeno, String login, String logout, String hours, String comments) {
		super();
		this.id = id;
		this.emplyeno = emplyeno;
		this.login = login;
		this.logout = logout;
		this.hours = hours;
		this.comments = comments;
	}

	public temp() {
		super();
	}

	 
	
	 
	
	 
    
    
    
    
    
    
    
    
    

}
