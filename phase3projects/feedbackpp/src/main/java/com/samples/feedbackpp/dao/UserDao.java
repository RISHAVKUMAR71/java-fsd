package com.samples.feedbackpp.dao;

import java.util.List;

import com.samples.feedbackpp.entity.User;

public interface UserDao {

	int create(User user);
	
	List<User> findUsers();
	
}
