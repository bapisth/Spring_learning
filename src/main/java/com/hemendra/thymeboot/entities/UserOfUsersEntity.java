package com.hemendra.thymeboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="users_users")
@Data
public class UserOfUsersEntity extends  BaseEntity {
	
	@Column
	private Integer user_id; //ID of the user (Indexed field)
	
	@Column
	private Integer follow_user_id; //ID of the user to follow (Indexed field)
	
}
