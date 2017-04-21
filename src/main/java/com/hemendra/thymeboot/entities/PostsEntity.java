package com.hemendra.thymeboot.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import com.hemendra.thymeboot.bookmark.BookmarksEntity;

import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class PostsEntity {
	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "post_id")
	private Integer postId;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity userId;
	
	@ManyToOne
	@JoinColumn(name = "collection_id")
	private CollectionsEntity collectionId;
	
	@Column(name = "image_path")
	private String imagePath;
	
	@Column
	private String title;
	
	@Column
	private String subtitle;
	
	@Column
	private String text;
	
	@Column
	private String status;
	
	@Column
	private Integer views;
	
	@Column(name = "date_created")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dateCreated;
	
	@Column(name = "date_updated")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dateUpdated;
	
	@OneToMany(mappedBy = "postId")
	private List<BookmarksEntity> bookmarks;
	
	@OneToMany(mappedBy = "postId")
	private List<RecommendationsEntity> recommendations;
	
}
