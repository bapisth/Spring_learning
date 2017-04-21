package com.hemendra.thymeboot.entities;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class UsersEntity {

	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private Integer user_id; //Primary ID that preferably auto increments (if supported in chosen DB)
	
	@Column
	private String username; //Username (Unique Index)
	
	@Column 
	private String email; //Email address (Unique Index)
	
	@Column
	private String salted_password; //Salted password digest
	
	@Column
	private String first_name; //First name of user

	@Column
	private String last_name; //Last name of user
	
	@Column
	private String last_ip; // Last known user IP address
	
	@Column
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date_created; //When did this user sign up?
	
	@Column
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date_updated; //Last time this user was updated?
	
	@OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
	private Set<PostsEntity> posts; //One user has many posts
	
	@OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL)
	private Set<CollectionsEntity> collections;//One user has many collections
	
	@OneToMany(mappedBy = "user_id")
	private Set<BookmarksEntity> bookmarks;
}
