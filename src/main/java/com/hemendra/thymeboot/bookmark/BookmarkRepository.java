package com.hemendra.thymeboot.bookmark;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepository extends JpaRepository<BookmarksEntity, Serializable> {
	BookmarksEntity findByUserId(Integer userId);
}
