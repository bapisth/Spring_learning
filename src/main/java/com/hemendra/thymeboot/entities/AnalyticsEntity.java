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
 * A table for storing post analytics which can be used for trending data. Recommendations are used for trending data as well.
 * @author BAPI1
 *
 */

@Entity
@Table(name = "analytics")
@Data
public class AnalyticsEntity extends BaseEntity {
	
	@Column(name = "post_id")
	private Integer postId; //ID of the post (Indexed field)
	
	@Column(name = "date_created")
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date dateCreated; //When was this post viewed?
}
