package com.hemendra.thymeboot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	private Integer collection_id; //Primary ID that preferably auto increments
	
	@Column
	private Integer user_id; //ID of the user who started this collection
	
	@Column
	private String image_path; //Path to image on the server for the collection
	
	@Column
	private String name; //Name of the collection
	
	@Column
	private String subtitle; //Subtitle displayed on collection landing page
	
	@Column
	private String slug; //Lowercased hyphenated version of the name for URL's
	
	@Column
	private Integer followers; //Number of follows watching this collection
}
