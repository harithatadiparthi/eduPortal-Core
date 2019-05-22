package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
public class User {
 
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  
  @Column(name="Email_Address")
  private String Email_Address;
  @Column(name="Role")
  private String Role;
  
  public User(String Email_Address, String Role) {
	this.Email_Address=Email_Address;
	this.Role=Role;
  }
public String getId() {
		return Role;
	}
public String getEmail_Address() {
	return Email_Address;
}
public void setEmail_Address(String email_Address) {
	Email_Address = email_Address;
}
public String getRole() {
	return Role;
}
public void setRole(String role) {
	Role = role;
}
  
}
