package com.hemendra.thymeboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
	@Column
	private Integer user_id; //ID of the user (Indexed field)
	
	@Column
	private Integer post_id; //ID of the post (Indexed field)
	
}
