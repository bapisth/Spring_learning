package com.hemendra.thymeboot.entities.posts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostsServiceImpl implements PostsService {

	@Autowired
	private PostsDao postsDao;
	
	@Override
	public void add(PostsDto postsDto) {
		PostsEntity postsEntity = new PostsEntity(postsDto);
		postsDao.add(postsEntity);
	}

	@Override
	public void update(PostsDto postsDto) {
		PostsEntity postsEntity = new PostsEntity(postsDto);
		postsDao.update(postsEntity);
	}

	@Override
	public void delete(Integer postId) {
		postsDao.delete(postId);
	}

	@Override
	public List<PostsDto> findAll() {
		List<PostsEntity> postsEntities = postsDao.findAll();
		List<PostsDto> postsDtos = new ArrayList<>();
		postsEntities.forEach(post -> {
			postsDtos.add(new PostsDto(post));
		});
		System.out.println(postsDtos);
		return postsDtos;
	}

}
