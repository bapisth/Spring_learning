package com.hemendra.thymeboot.entities.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDao usersDao;
	
	@Override
	public void add(UsersDto usersDto){
		UsersEntity usersEntity = new UsersEntity(usersDto);
		usersDao.add(usersEntity);
	}
	
}
