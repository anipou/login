package com.project.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.login.entities.User;

public interface UserDao extends JpaRepository<User, Long> { 
	
	
	 /* @Query(value = "select u from User u where password=? and username=?") 
	 
	  @Query(value =
	  "select u from user u where password=? and username=?",nativeQuery = true) 
	 //SQL
	  
	  List<User> getUsersPasswordAndUsername(String password, String username);
	  
	  select * from user where password=? and username=?  
	 */

}
 