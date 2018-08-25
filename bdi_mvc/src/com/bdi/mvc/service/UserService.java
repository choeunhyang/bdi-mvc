package com.bdi.mvc.service;

import java.util.List;
import java.util.Map;

import com.bdi.mvc.vo.User;

public interface UserService {
	public List<User> getUserList(User us);
	public User getUser(int uNum);
	public Map<String,Object> insertUser(User us);
	public Map<String,Object> updateUser(User us);
	public Map<String,Object> deleteUser(int us);
}
