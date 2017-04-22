package com.hemendra.thymeboot.entities.user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
	@Override
	public List<UsersDto> allUsers() {
		List<UsersDto> usersDtos = new ArrayList<>();
		List<UsersEntity> users = usersDao.findAll();
		users.forEach(user ->{
			usersDtos.add(new UsersDto(user));
		});
		return usersDtos;
	}

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public void add(UsersDto usersDto){
		UsersEntity usersEntity = new UsersEntity(usersDto);
		usersDao.add(usersEntity);
	}
	
}
