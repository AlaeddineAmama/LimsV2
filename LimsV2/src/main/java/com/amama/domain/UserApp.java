package com.amama.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class UserApp {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String username ;
	private String password ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserApp(Long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public UserApp(Long id) {
		super();
		this.id = id;
	}
	public UserApp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
