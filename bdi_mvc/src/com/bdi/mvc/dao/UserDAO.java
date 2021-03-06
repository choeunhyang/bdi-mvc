package com.bdi.mvc.dao;

import java.util.List;

import com.bdi.mvc.vo.User;

public interface UserDAO {
	public List<User> selectUserList(User us);
	public User selectUser(int uNum);
	public int insertUser(User us);
	public int updateUser(User us);
	public int deleteUser(User us);
}
