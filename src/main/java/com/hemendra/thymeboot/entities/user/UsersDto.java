package com.hemendra.thymeboot.entities.user;

import java.util.Date;

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
    private Date dateCreated;
    private Date dateUpdated;
}
