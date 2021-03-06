package com.bdi.mvc.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.bdi.mvc.vo.Depart;
import com.bdi.mvc.vo.Game;

public interface GameDAO {
	public void setConnection(Connection con);
	public List<Game> selectGameList(Game game)throws SQLException;
	public Game selectGame(Game game)throws SQLException;
	public int insertGame(Game game)throws SQLException;
	public int updateGame(Game game)throws SQLException;
	public int deleteGame(Game game)throws SQLException;
}
