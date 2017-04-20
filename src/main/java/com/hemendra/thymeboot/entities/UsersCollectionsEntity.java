package com.hemendra.thymeboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * A table for users following particular collections
 * @author BAPI1
 *
 */
@Entity
@Table(name = "users_collections")
@Data
public class UsersCollectionsEntity extends BaseEntity { 
	
	@Column
	private Integer collection_id;//ID of the collection
	
	@Column
	private Integer user_id; //ID of the user
}
