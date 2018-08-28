package com.bdi.mvc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bdi.mvc.common.DBCon;
import com.bdi.mvc.dao.UserDAO;
import com.bdi.mvc.vo.User;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> selectUserList(User us) {
		List<User> list = new ArrayList<User>();
		Connection con = DBCon.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select uNum, uName, uId, uPwd, uPwdch, uDesc, uAge from user_in";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				us = new User(rs.getInt("uNum"),
						rs.getString("uName"),
						rs.getString("uId"),
						rs.getString("uPwd"),
						rs.getString("uPwdch"),
						rs.getString("uDesc"),
						rs.getInt("uAge"));
				list.add(us);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				} else if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {

			}
			DBCon.close();
		}
		return list;
	}

	@Override
	public User selectUser(int uNum) {
		Connection con = DBCon.getCon();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "select uNum, uName, uId, uPwd, uPwdch, uDesc, uAge from user_in where uNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, uNum);
			rs = ps.executeQuery();
			if (rs.next()) {
				User us = new User(rs.getInt("uNum"), rs.getString("uName"), rs.getString("uId"), rs.getString("uPwd"),
						 rs.getString("uPwdch"),rs.getString("uDesc"), rs.getInt("uAge"));
				return us;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				} else if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {

			}
			DBCon.close();
		}
		return null;
	}

	@Override
	public int insertUser(User us) {
		Connection con = DBCon.getCon();
		PreparedStatement ps = null;
		/*String sql = "insert into user_in uName=?, uId=?, uPwd=?, uDesc=?, uAge=?";//이거안됨*/
		String sql = "insert into user_in(uName, uId, uPwd, uPwdch, uDesc, uAge) values(?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, us.getUname());
			ps.setString(2, us.getUid());
			ps.setString(3, us.getUpwd());
			ps.setString(4, us.getUpwdch());
			ps.setString(5, us.getUdesc());
			ps.setInt(6, us.getUage());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {

			}
			DBCon.close();
		}
		return 0;
	}

	@Override
	public int updateUser(User us) {
		Connection con = DBCon.getCon();
		PreparedStatement ps = null;
		String sql = "update user_in set uName=?, uId=?, uPwd=?, uPwdch=?, uDesc=?, uAge=? where uNum=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, us.getUname());
			ps.setString(2, us.getUid());
			ps.setString(3, us.getUpwd());
			ps.setString(4, us.getUpwdch());
			ps.setString(5, us.getUdesc());
			ps.setInt(6, us.getUage());
			ps.setInt(7, us.getUnum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {

			}
			DBCon.close();
		}
		return 0;
	}

	@Override
	public int deleteUser(User us) {
		Connection con = DBCon.getCon();
		String sql = "delete from user_in where uNum=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, us.getUnum());
			return ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		return 0;
	}

}
