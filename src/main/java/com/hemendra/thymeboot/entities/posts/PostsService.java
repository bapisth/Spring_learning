package com.hemendra.thymeboot.entities.posts;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface PostsService {
	void add(PostsDto postsDto);
	void update(PostsDto postsDto);
	void delete(Integer postId);
	List<PostsDto> findAll();
}
