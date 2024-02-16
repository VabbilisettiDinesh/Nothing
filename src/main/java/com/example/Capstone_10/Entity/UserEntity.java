package com.example.Capstone_10.Entity;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;

@Entity
public class UserEntity {
    @Id
    @Email(message="Enter a valid email")
    private String mail;
    public UserEntity() {
		super();
	}
	public UserEntity(@Email(message = "Enter a valid email") String mail, String username, String password) {
		super();
		this.mail = mail;
		this.username = username;
		this.password = password;
	}
	private String username;
    private String password;
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
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
	@Override
	public String toString() {
		return "UserEntity [mail=" + mail + ", username=" + username + ", password=" + password + "]";
	}
    
}

