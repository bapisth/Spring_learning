package com.hemendra.thymeboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
/**
 * A table for holding posts assigned to a particular collection
 * @author BAPI1
 *
 */

@Entity
@Table(name = "posts_collections")
@Data
public class PostCollectionsEntity {
	
	@Column
	private Integer collection_id; //ID of the collection this post belongs to (Indexed field)
	
	@Column
	private Integer post_id; //ID of the post (Indexed field)
}
