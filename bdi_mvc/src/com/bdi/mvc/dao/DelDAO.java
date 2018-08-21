package com.bdi.mvc.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DelDAO {
	public List<Map<String,String>> selectDelList()throws SQLException;
	public Map<String,String> selectDel(int num) throws SQLException;
	public int deleteDels(String[] nums) throws SQLException;
}
