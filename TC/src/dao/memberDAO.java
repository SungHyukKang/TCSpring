package dao;
import java.sql.*;
import Util.Util;
import dto.memberDTO;
public class memberDAO {
	 Connection conn=null;
	 PreparedStatement pstmt=null;
	 ResultSet rs=null;
	public memberDAO(){
		 conn=Util.getConn();
	 }
	
	public String pw_search(String id , String email){
		  String sql = "Select pw from members where id=? and email=? ";
		    try {				
					pstmt=conn.prepareStatement(sql);				
					pstmt.setString(1,id);
					pstmt.setString(2,email);
					rs=pstmt.executeQuery();
					while(rs.next()){
						if(rs.getString(1)!=null){
							
								return rs.getString(1) ;
							}else{
								return null; //������ ��й�ȣ , ��й�ȣ Ȯ�� �ٸ� ��
							}
						}
					 return null;
					}
				 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally{
		    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
					if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
					if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
			}
			return null;
				
		  }
	  
	  public String id_search(String name , String email){
		  String sql = "Select id from members where name=? and email=? ";
		  
		  
		  
			  try {				
					pstmt=conn.prepareStatement(sql);				
					pstmt.setString(1,name);
					pstmt.setString(2,email);
					rs=pstmt.executeQuery();
					while(rs.next()){
						if(rs.getString(1)!=null){
							
								return rs.getString(1) ;
							}else{
								return null; //������ ��й�ȣ , ��й�ȣ Ȯ�� �ٸ� ��
							}
						}
					 return null;
					}
				 catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			return null;
				
		  }
	
		public int modify(memberDTO dto , String modifyPw,String enteredPw){
			String sql ="Select pw from members where id=?";
			int X =0;
			try {				
				pstmt=conn.prepareStatement(sql);				
				pstmt.setString(1,dto.getId());
				rs=pstmt.executeQuery();
				while(rs.next()){
					if(rs.getString(1).equals(dto.getPw())){
						if(modifyPw.equals(enteredPw)){
							pstmt=null;
							sql="update members set pw=? where id=?";
							pstmt=conn.prepareStatement(sql);
							pstmt.setString(1,modifyPw);
							pstmt.setString(2,dto.getId());
							X=pstmt.executeUpdate();
							return X;
						}else{
							return -1; 
						}
					}else
						return -2;
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
	    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
				if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
				if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
		}
			return 0;
		}
	 	public int register(memberDTO dto){
	 		int X = 0;
	 		String sql ="insert into members(id,pw,name,email,nickname) values(?,?,?,?,?) ";
	 		try {
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, dto.getId());
				pstmt.setString(2, dto.getPw());
				pstmt.setString(3, dto.getName());
				pstmt.setString(4, dto.getEmail());
				pstmt.setString(5, dto.getNickname());
				X=pstmt.executeUpdate();
				
			}catch(SQLIntegrityConstraintViolationException e){
				System.out.println("�����ϴ� ���̵�");
				e.printStackTrace();
			}
	 		catch (SQLException e) {
	 			e.printStackTrace();
			}finally{
    	    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
    				if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
    				if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
    	    	
			}
	 		return X;
	 	}
	 
        public int login(String id , String pw){
        	String SQL= "SELECT pw FROM members WHERE  id = ?";
    	    try {
    	    	pstmt=conn.prepareStatement(SQL);
    	    	pstmt.setString(1,id);
    	    	rs =pstmt.executeQuery();    	    	
    	    	if(rs.next()) {
    	    		if(rs.getString(1).equals(pw)) {
    	    			return 1; 
    	    		}
    	    		else 
    	    			 return 0 ;
    	    	}
    	    	return -1;
    	    }
    	    catch(Exception e){
    	    	 e.printStackTrace();
    	    	 return -2;	
    	    }finally{
    	    		if (rs != null) {try {rs.close();} catch (SQLException e) {e.printStackTrace();}}
    				if (conn != null) {try {conn.close();} catch (SQLException e) {e.printStackTrace();}}
    				if (pstmt != null) {try {pstmt.close();} catch (SQLException e) {e.printStackTrace();}}
    	    }
    	}
}