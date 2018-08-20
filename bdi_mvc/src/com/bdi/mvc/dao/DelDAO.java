package com.bdi.mvc.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DelDAO {
	public List<Map<String,String>> selectDelList()throws SQLException;
}
