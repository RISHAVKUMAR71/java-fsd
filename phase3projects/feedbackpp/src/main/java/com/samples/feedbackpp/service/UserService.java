package com.samples.feedbackpp.service;

import java.util.List;

import com.samples.feedbackpp.entity.User;

public interface UserService {

	int save(User user);
	
	List<User> getUsers();
	
}
