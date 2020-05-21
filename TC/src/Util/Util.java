package Util;

import java.sql.*;

public class Util {

	public static Connection getConn(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String dbURL ="jdbc:mysql://localhost:3306/testcase?serverTimezone=UTC";
			String dbID ="root";
			String dbPassword="password";
			conn = DriverManager.getConnection(dbURL,dbID,dbPassword);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(SQLException e){
			e.printStackTrace();
		}
		return conn;
	}
}