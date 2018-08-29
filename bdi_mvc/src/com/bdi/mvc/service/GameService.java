package com.bdi.mvc.service;

import java.sql.SQLException;
import java.util.List;

import com.bdi.mvc.vo.Game;

public interface GameService {
	public List<Game> selectGameList(Game game) throws SQLException; 
}
