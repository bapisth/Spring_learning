package com.hemendra.thymeboot.entities.posts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface PostsDao {
	void add(PostsEntity postsEntity);
	void update(PostsEntity postsEntity);
	void delete(Integer postId);
	List<PostsEntity> findAll();
}
