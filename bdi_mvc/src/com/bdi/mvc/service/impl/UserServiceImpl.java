package com.bdi.mvc.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.dao.UserDAO;
import com.bdi.mvc.dao.impl.UserDAOImpl;
import com.bdi.mvc.service.UserService;
import com.bdi.mvc.vo.User;

public class UserServiceImpl implements UserService {
	private UserDAO mdao = new UserDAOImpl();
	
	@Override
	public List<User> getUserList(User us) {
		return mdao.selectUserList(us);
	}

	@Override
	public User getUser(int uNum) {
		return mdao.selectUser(uNum);
	}

	@Override
	public Map<String, Object> insertUser(User us) {
		Map<String, Object> rMap = new HashMap<String,Object>();
		rMap.put("msg","등록오류!");
		rMap.put("success","false");
		if(mdao.insertUser(us)==1) {
			rMap.put("msg","정상 등록 완료!");
			rMap.put("success","true");
		}return rMap;
	}

	@Override
	public Map<String, Object> updateUser(User us) {
		int cnt = mdao.updateUser(us);
		Map<String, Object> rMap = new HashMap<String,Object>();
		rMap.put("msg","수정오류!");
		rMap.put("success","false");
		if(cnt==1) {
			rMap.put("msg","정상 수정 완료!");
			rMap.put("success","true");
		}return rMap;
	}

	@Override
	public Map<String, Object> deleteUser(int us) {
		return null;
	}

}
