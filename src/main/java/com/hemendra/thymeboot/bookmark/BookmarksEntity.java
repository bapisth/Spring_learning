package com.hemendra.thymeboot.bookmark;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.hemendra.thymeboot.entities.PostsEntity;
import com.hemendra.thymeboot.entities.user.UsersEntity;

import lombok.Data;

@Entity
@Table(name = "bookmarks")
@Data
public class BookmarksEntity {
	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "bookmark_id")
	private Integer bookmarkId; //Primary ID that preferably auto increments (if supported in chosen DB)
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity userId; //ID of the user (Indexed field)
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private PostsEntity postId; //ID of the post (Indexed field)
	
}
