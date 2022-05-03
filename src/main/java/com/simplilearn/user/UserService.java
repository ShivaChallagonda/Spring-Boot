package com.simplilearn.user;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	//return all users
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<>();
		userRepository.findAll()
		.forEach(users::add);
		
		return users;
	}
	
	
	//return a single user
	public User getUser(int id) {
		Optional<User> optionalUser = userRepository.findById(id);
		if(optionalUser.isPresent()) {
			return optionalUser.get();
		}
		return null;
	}
	
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	public void updateUser(int id,User user) {
		userRepository.save(user);
	}


	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}
	
	
}
