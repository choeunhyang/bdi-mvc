package com.bdi.mvc.service.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.dao.DelDAO;
import com.bdi.mvc.dao.impl.DelDAOImpl;
import com.bdi.mvc.service.DelService;

public class DelServiceImpl implements DelService {
	private DelDAO ddao = new DelDAOImpl(); 
	@Override
	public List<Map<String, String>> getDelList() throws SQLException {
		return ddao.selectDelList();
	}

}
