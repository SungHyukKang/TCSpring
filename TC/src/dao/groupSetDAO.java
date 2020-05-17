package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Util.Util;

public class groupSetDAO {
	Connection conn;
	 PreparedStatement pstmt;
	 
	 public groupSetDAO(){
		 conn=Util.getConn();
	}
	public int groupSet(String id , String[] groups) {
		String sql =null;
		try {
			for(String Z :groups) {
				sql ="insert into group_set values(?,?,2,now())";
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, Integer.parseInt(Z));
				pstmt.setString(2,id);
				pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}finally{
			if(pstmt!=null) {
				try{pstmt.close();}catch(SQLException e) {}
			}if(conn!=null) {
				try {conn.close();}catch(SQLException e) {}
			}
		}
		return 1;
	}
	
	
}
