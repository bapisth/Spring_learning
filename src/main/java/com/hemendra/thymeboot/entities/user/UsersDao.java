package com.hemendra.thymeboot.entities.user;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

@Transactional
@Service
public interface UsersDao {
	void add(UsersEntity usersEntity);
	void update(UsersEntity usersEntity);
	void delete(Integer userId);
	UsersEntity findByUserId(Integer userId);
	List<UsersEntity> findAll();
	UsersEntity findByEmail(String email);
}
