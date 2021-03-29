package com.project.login.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.login.dao.UserDao;
import com.project.login.entities.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao; 

	public UserServiceImpl() {

	}

	@Override
	public List<User> getUsers() {

		return userDao.findAll(); 
	}

	@Override
	public User getUser(long userId) {

		return userDao.getOne(userId);

	}

	@Override
	public User addUser(User user) {

		userDao.save(user);
		return user;
	}

}
