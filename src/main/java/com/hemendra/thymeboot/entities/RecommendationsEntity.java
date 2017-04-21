package com.hemendra.thymeboot.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

/**
 * Whenever a user recommends an article.
 * @author BAPI1
 *
 */
@Entity
@Table(name = "recommendations")
@Data
public class RecommendationsEntity extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UsersEntity userId;
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private PostsEntity postId;
	
	@Column(name = "date_created")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dateCreated; //When was this post recommended?
}
