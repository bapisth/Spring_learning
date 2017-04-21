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

import com.hemendra.thymeboot.bookmark.BookmarksEntity;

import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class UsersEntity {

	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "user_id")
	private Integer userId; //Primary ID that preferably auto increments (if supported in chosen DB)
	
	@Column
	private String username; //Username (Unique Index)
	
	@Column 
	private String email; //Email address (Unique Index)
	
	@Column(name = "salted_password")
	private String saltedPassword; //Salted password digest
	
	@Column(name = "first_name")
	private String firstName; //First name of user

	@Column(name = "last_name")
	private String lastName; //Last name of user
	
	@Column(name = "last_ip")
	private String lastIp; // Last known user IP address
	
	@Column(name = "date_created")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dateCreated; //When did this user sign up?
	
	@Column(name = "date_updated")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dateUpdated; //Last time this user was updated?
	
	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private Set<PostsEntity> posts; //One user has many posts
	
	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private Set<CollectionsEntity> collections;//One user has many collections
	
	@OneToMany(mappedBy = "userId")
	private Set<BookmarksEntity> bookmarks;
	
	@OneToMany(mappedBy = "userId")
	private Set<RecommendationsEntity> recommendations;
}
