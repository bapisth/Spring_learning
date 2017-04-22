package com.hemendra.thymeboot.entities.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface UsersService {
	void add(UsersDto usersDto);
	List<UsersDto> allUsers();
}
