package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Util.Util;

public class NotificationDAO {
	Connection conn = null;
	PreparedStatement pstmt=null;
	 ResultSet rs=null;
	 
	 NotificationDAO(){
		 conn=Util.getConn();
	 }
	 
	 public int notice() {
		 String sql =null;
		 try {
			pstmt=conn.prepareStatement(sql);
			sql="Select ";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}				
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
	}
		 
		 return 1;
	 }
	 
	 
}
