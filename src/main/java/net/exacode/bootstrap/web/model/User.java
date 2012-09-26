package net.exacode.bootstrap.web.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Sime DTO that represents basic information on a user.
 * @author pmendelski
 *
 */
@XmlRootElement(name = "user")
public class User { 
	
	private String name;
	
	private String surname;
	
	public User() {
		
	}
	
	public User(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
