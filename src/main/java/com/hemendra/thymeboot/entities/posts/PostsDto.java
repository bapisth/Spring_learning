package com.hemendra.thymeboot.entities.posts;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hemendra.thymeboot.entities.user.UsersDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostsDto {
	private Integer postId;
	private String imagePath;
	private String title;
	private String subtitle;
	private String text;
	private String status;
	private Integer views;
	@JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateCreated;
	
	@JsonFormat(pattern = "yyyy/MM/dd")
    private Date dateUpdated;
	
	private UsersDto user;
	
	public PostsDto(PostsEntity postsEntity){
		this.postId = postsEntity.getPostId();
		this.imagePath = postsEntity.getImagePath();
		this.title = postsEntity.getTitle();
		this.subtitle = postsEntity.getSubtitle();
		this.text = postsEntity.getText();
		this.status = postsEntity.getStatus();
		this.views = postsEntity.getViews();
		this.dateCreated = postsEntity.getDateCreated();
		this.dateUpdated = postsEntity.getDateUpdated();
		this.user = new UsersDto(postsEntity.getUserId());
	}
}
