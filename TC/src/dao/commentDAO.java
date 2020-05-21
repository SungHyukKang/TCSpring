package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Util.Util;
import dto.free_commentDTO;

public class commentDAO {
	Connection conn =null;
	PreparedStatement pstmt=  null;
	ResultSet rs = null;
	
	public commentDAO(){
		conn=Util.getConn();
	}
	
	public int write(free_commentDTO dto , int fnum) {
		String sql =null;
		try {
			sql="insert into free_comment(fnum,fcid,fccontent,fcdate) values(?,?,?,now())";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, fnum);
			pstmt.setString(2, dto.getFcid());
			pstmt.setString(3, dto.getFccontent());
			pstmt.executeUpdate();
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
	
	public ArrayList<free_commentDTO> loadcomment(int fnum) {
		String sql=null;
		ArrayList<free_commentDTO> arr = new ArrayList<>();
		free_commentDTO dto = null;
		sql="select fcid , fccontent , fcdate from free_comment where fnum=?";
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, fnum);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto = new free_commentDTO();
				dto.setFcid(rs.getString("fcid"));
				dto.setFccontent(rs.getString("fccontent"));;
				dto.setFcdate(rs.getString("fcdate"));
				arr.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}				
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
	}
		
		
		return arr;
	}
	
}
