package com.tka.jdbc;

import java.sql.*;
public class DatabaseConnect {
	
	
	static void connect()
	{
		try
		{
	Class.forName("com.mysql.jdbc.Driver");
	
	Connection con = DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/aprojt1", "usernm", "password");
	System.out.println("Connected to the database");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		connect();
		

	}

}
