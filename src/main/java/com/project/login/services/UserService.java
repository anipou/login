package com.project.login.services;

import java.util.List;

import com.project.login.entities.User;

public interface UserService {
	//For Loose Coupling
public List<User> getUsers();

public User getUser(long userId);

public User addUser(User user);  
	


}
