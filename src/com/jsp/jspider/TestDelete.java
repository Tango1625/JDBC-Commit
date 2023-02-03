package com.jsp.jspider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDelete {

	public static void main(String[] args) throws SQLException {
          String url ="jdbc:mysql://localhost:3306/jspider";
          String username = "root";
  		String password = "root";
  		Connection connection = null;
  		String sql = "DELETE FROM STUDENT WHERE STD_ID = 8";
  		try {
  		// register driver
  			Class.forName("com.mysql.cj.jdbc.Driver");
  		// establish connection
  			connection = DriverManager.getConnection(url, username, password);
  		// create statement
  			Statement statement = connection.createStatement();
  		// execute statement
  		  int res = statement.executeUpdate(sql);
  			if(res>0)
  				System.out.println("objected is deleted");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// connection close
			if(connection!=null) {
			connection.close();
			System.out.println("finally executed");
			}
		}
	}

}
