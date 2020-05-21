package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import Util.Util;
import java.util.*;
import dto.groupDTO;
public class groupDAO {
	Connection conn=null;
	 PreparedStatement pstmt=null;
	 ResultSet rs=null;
	public groupDAO(){
		 conn=Util.getConn();
	 }
	
	public ArrayList<groupDTO> myGroup(String id){
		String sql ="select * from grouplist where gnum IN (select gnum from members,group_set where members.id=? and group_set.id=?)";
		ArrayList<groupDTO> arr= new ArrayList<>();
		groupDTO dto = null;
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				dto = new groupDTO();
				dto.setGnum(rs.getInt("gnum"));
				dto.setGboss(rs.getString("gboss"));
				dto.setGintro(rs.getString("gintro"));
				dto.setGname(rs.getString("gname"));
				dto.setGdate(rs.getString("gdate"));
				dto.setUserMax(rs.getInt("usermax"));
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
	
	public ArrayList<groupDTO> search(String key) {
		String sql ="select * from grouplist where gname LIKE ?";
		ArrayList<groupDTO> arr = new ArrayList<>();
		groupDTO gro = null; 
		try {
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "%"+key+"%");
			rs=pstmt.executeQuery();
			while(rs.next()) {
				gro=new groupDTO();
				gro.setGname(rs.getString("gname"));
				gro.setGintro(rs.getString("gintro"));
				gro.setGnum(rs.getInt("gnum"));
				gro.setUserMax(rs.getInt("userMax"));
				gro.setGboss(rs.getString("gboss"));
				arr.add(gro);
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
	
	public int register(String gname , String gintro ,int userMax,String id){
 		int X = 0;
 		int gnum=0;
 		String sql ="insert into grouplist(gname,gintro,gdate,userMax,gboss) values(?,?,now(),?,?) ";
 		try {
			pstmt=conn.prepareStatement(sql);			
			pstmt.setString(1, gname);
			pstmt.setString(2, gintro);						
			pstmt.setInt(3,userMax);
			pstmt.setString(4, id);
			X=pstmt.executeUpdate();
			String gnumSql="select gnum from grouplist where gname=? AND gboss=?";
			pstmt=null;
			pstmt=conn.prepareStatement(gnumSql);
			pstmt.setString(1, gname);
			pstmt.setString(2, id);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				gnum=rs.getInt("gnum");
			}
			
			sql = "insert into group_set values(?,?,1,now())";
			pstmt=null;
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,gnum);
			pstmt.setString(2, id);
			pstmt.executeUpdate();
		}catch(SQLIntegrityConstraintViolationException e){
			System.out.println("nono");
			e.printStackTrace();
		}
 		catch (SQLException e) {
 			e.printStackTrace();
		}finally{
    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}				
			if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
	}
 		return X;
 	}
  	
}
