package com.hemendra.thymeboot.entities.posts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostsController {
	@Autowired
	private PostsService postsService;
	
	@RequestMapping(method = RequestMethod.GET)
	public List<PostsDto> allPosts(){
		return postsService.findAll();
	}
	
	@RequestMapping(value="/create", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public void addPost(@RequestBody PostsDto postsDto){
		postsService.add(postsDto);
	}
}
