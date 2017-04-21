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

import lombok.Data;

@Entity
@Table(name = "posts")
@Data
public class PostsEntity {
	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private Integer post_id;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity user_id;
	
	@Column
	private String image_path;
	
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
	
	@Column
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date_created;
	
	@Column
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date_updated;
	
	@OneToMany(mappedBy = "post_id")
	private List<BookmarksEntity> bookmarks;
}
