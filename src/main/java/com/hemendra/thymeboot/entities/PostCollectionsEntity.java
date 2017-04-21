package com.hemendra.thymeboot.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
public class PostCollectionsEntity extends BaseEntity {
	
	@ManyToOne
	@JoinColumn(name = "collection_id")
	private CollectionsEntity collectionId; //ID of the collection this post belongs to (Indexed field)
	
	@ManyToOne
	@JoinColumn(name = "post_id")
	private PostsEntity postId; //ID of the post (Indexed field)
}
