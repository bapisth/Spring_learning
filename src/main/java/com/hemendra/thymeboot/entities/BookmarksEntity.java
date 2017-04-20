package com.hemendra.thymeboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "bookmarks")
@Data
public class BookmarksEntity {
	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private Integer bookmark_id; //Primary ID that preferably auto increments (if supported in chosen DB)
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity user_id; //ID of the user (Indexed field)
	
	@Column
	private PostsEntity post_id; //ID of the post (Indexed field)
	
}
