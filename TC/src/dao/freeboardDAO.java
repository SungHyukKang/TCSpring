package dao;

import java.sql.*;
import java.util.ArrayList;

import Util.Util;
import dto.freeboardDTO;

public class freeboardDAO {
	 Connection conn=null;
	 PreparedStatement pstmt=null;
	 ResultSet rs=null;
	 
	public freeboardDAO(){
		 conn=Util.getConn();
	 }
	
	public String getDate() {
		String SQL ="SELECT NOW()";
		try {
			PreparedStatement pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				return rs.getString(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";//데이터베이스 오류
	}
	public ArrayList<freeboardDTO> contentlist(int gnum) {
		String sql = "Select * from freeboard where gnum=?";
		ArrayList<freeboardDTO> arr =new ArrayList<>();
		freeboardDTO dto = null;
		try {
			PreparedStatement pstmt= conn.prepareStatement(sql);
			pstmt.setInt(1,gnum);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto=new freeboardDTO();
				dto.setGnum(gnum);
				dto.setFnum(rs.getInt("fnum"));
				dto.setFtitle(rs.getString("ftitle"));
				dto.setContent(rs.getString("fcontent"));
				dto.setFid(rs.getString("fid"));
				dto.setFadate(rs.getString("fdate"));
				dto.setFview(rs.getInt("fview"));
				arr.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
	}
		return arr;
	}
	public int write(int gnum , String ftitle , String fcontent ,String fid) {
		 String SQL ="INSERT INTO freeboard(gnum,ftitle,fcontent,fdate,fid) VALUES (?,?,?,?,?)";
			try {
				PreparedStatement pstmt = conn.prepareStatement(SQL);
				pstmt.setInt(1, gnum);
				pstmt.setString(2, ftitle);
				pstmt.setString(3, fcontent);
				pstmt.setString(4, getDate());
				pstmt.setString(5, fid);
				return pstmt.executeUpdate();
			}
				
			 catch (SQLException e) {
				e.printStackTrace();
			}finally{
	    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
				if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
				if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
			return -1;//데이터베이스 오류
		 
	 }
}
