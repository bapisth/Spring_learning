package com.hemendra.thymeboot.entities.user;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UsersDto {
	private Integer userId;
	
	private String username;
	
	private String email;
	
	private String saltedPassword;
	
	private String firstName;
	
	private String lastName;
	
	private String lastIp;
	
	@JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateCreated;
	
	@JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateUpdated;
    
    public UsersDto(UsersEntity usersEntity) {
    	this.userId = usersEntity.getUserId();
    	this.username = usersEntity.getUsername();
    	this.email = usersEntity.getEmail();
    	this.saltedPassword = usersEntity.getSaltedPassword();
    	this.firstName = usersEntity.getFirstName();
    	this.lastName = usersEntity.getLastName();
    	this.lastIp = usersEntity.getLastIp();
    	this.dateCreated = usersEntity.getDateCreated();
    	this.dateUpdated = usersEntity.getDateUpdated();
	}
}
