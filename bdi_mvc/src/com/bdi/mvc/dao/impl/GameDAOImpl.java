package com.bdi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bdi.mvc.dao.GameDAO;

public class GameDAOImpl implements GameDAO {
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public void setConnection(Connection con) {
		String sql = "select * from game-chart";
	}

}
