package com.bdi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.DelDAO;

public class DelDAOImpl implements DelDAO {

	@Override
	public List<Map<String, String>> selectDelList() throws SQLException {
		try {
			Connection con = DBCon.getCon();
			String sql = "select * from del";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			List<Map<String,String>> list = new ArrayList<Map<String,String>>();
			while(rs.next()) {
				Map<String,String> hm = new HashMap<String,String>();
				hm.put("num", rs.getString("num"));
				hm.put("name", rs.getString("name"));
				hm.put("age", rs.getString("age"));
				list.add(hm);
			}
			return list;
		}catch(SQLException e) {
			throw e;
		}finally {
			DBCon.close();
		}
	}

}
