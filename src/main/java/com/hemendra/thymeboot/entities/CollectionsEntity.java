package com.hemendra.thymeboot.entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "collections")
@Data
public class CollectionsEntity {
	
	@Id
	@GeneratedValue
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name = "collection_id")
	private Integer collectionId; //Primary ID that preferably auto increments
	
	@ManyToOne
	@JoinColumn(name= "user_id")
	private UsersEntity userId; //ID of the user who started this collection
	
	@Column(name = "image_path")
	private String imagePath; //Path to image on the server for the collection
	
	@Column(name = "name")
	private String name; //Name of the collection
	
	@Column
	private String subtitle; //Subtitle displayed on collection landing page
	
	@Column
	private String slug; //Lowercased hyphenated version of the name for URL's
	
	@Column
	private Integer followers; //Number of follows watching this collection
	
	@OneToMany(mappedBy = "collectionId")
	private Set<PostsEntity> postsEntities;
}
