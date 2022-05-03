package com.simplilearn.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer>{
	
	//getAllUsers
	//getUser(int id)
	//updateUser(User u)
	//deleteTopic

}
