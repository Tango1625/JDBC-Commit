package com.jsp.jspider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AllDetalis {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/jspider";
		String username = "root";
		String password = "root";
		String sql = "SELECT * FROM student"; 
		// TODO Auto-generated method stub
		try {
			// load/register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// establish connection
			 Connection connection = DriverManager.getConnection(url, username, password);

			// Create statement
			Statement statement = connection.createStatement();

			// execute statement
			 ResultSet resultSet =statement.executeQuery(sql);
			 while (resultSet.next()) {
				 System.out.println(resultSet.getInt(1));
				 System.out.println(resultSet.getString(2));
				 System.out.println(resultSet.getString(3));
				 System.out.println("======================");
				
			}

			// close the statement
			connection.close();
			System.out.println("all good");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
	}

	}
}

