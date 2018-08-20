package com.bdi.mvc.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface DelService {
	public List<Map<String,String>> getDelList() throws SQLException;
}
