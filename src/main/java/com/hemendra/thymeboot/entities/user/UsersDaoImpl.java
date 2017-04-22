package com.hemendra.thymeboot.entities.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UsersDaoImpl implements UsersDao {
	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void add(UsersEntity usersEntity){
		usersRepository.save(usersEntity);
	}
	
	@Override
	public void update(UsersEntity usersEntity){
		usersRepository.save(usersEntity);
	}
	
	@Override
	public void delete(Integer userId){
		usersRepository.delete(userId);
	}
	
	@Override
	public UsersEntity findByUserId(Integer userId){
		return usersRepository.findByUserId(userId);
	}
	
	@Override
	public List<UsersEntity> findAll(){
		return usersRepository.findAll();
	}
	
	@Override
	public UsersEntity findByEmail(String email){
		return usersRepository.findByEmail(email);
	}
}
