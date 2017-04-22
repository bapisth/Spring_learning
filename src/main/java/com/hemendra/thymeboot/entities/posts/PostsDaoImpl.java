package com.hemendra.thymeboot.entities.posts;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class PostsDaoImpl implements PostsDao{
	@Autowired
	private PostsRepository postsRepository;
	
	@Override
	public void add(PostsEntity postsEntity) {
		postsRepository.save(postsEntity);
	}

	@Override
	public void update(PostsEntity postsEntity) {
		postsRepository.save(postsEntity);
	}

	@Override
	public void delete(Integer postId) {
		postsRepository.delete(postId);
	}

	@Override
	public List<PostsEntity> findAll() {
		return postsRepository.findAll();
	}
	

}
