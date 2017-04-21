package com.hemendra.thymeboot.bookmark;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class BookmarkService {
	@Autowired
	private BookmarkRepository bookmarkRepository;
	
	public List<BookmarksEntity> findAll(){
		List<BookmarksEntity> bookmarks = new ArrayList<>();
		bookmarks.addAll(bookmarkRepository.findAll());
		return bookmarks;
	}
	
	public void add(BookmarksEntity bookmark){
		bookmarkRepository.save(bookmark);
	}
	
	public void update(BookmarksEntity bookmark) {
		bookmarkRepository.save(bookmark);
	}
	
	public void delete(Integer bookmarkId){
		BookmarksEntity bookmarksEntity = bookmarkRepository.findOne(bookmarkId);
		bookmarkRepository.delete(bookmarksEntity);
	}
	
}
