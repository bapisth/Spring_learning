package com.hemendra.thymeboot.entities.user;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<UsersEntity, Serializable>{
	UsersEntity findByUserId(Integer userId);
	UsersEntity findByEmail(String email);
	List<UsersEntity> findAllByFirstName(String firstName);
}
