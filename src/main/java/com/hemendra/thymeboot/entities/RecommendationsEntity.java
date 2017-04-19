package com.hemendra.thymeboot.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
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
public class RecommendationsEntity {
	
	@Column
	private Integer user_id;
	
	@Column
	private Integer post_id;
	
	@Column
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date date_created; //When was this post recommended?
}
