package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AllRecordFetch {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
			System.out.println("connection establish...");
			Statement stmt=connection.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from employee");
		     while(rs.next()) {
		    	 int id=rs.getInt("id");
		    	 String fname=rs.getString("fname");
		    	 String mobileno=rs.getString("mobileno");
		    	 
		    	  System.out.println("id is:"+id+ " " +"fnameis:"+fname+" "+"mobileno is:"+mobileno);
		      }
		     rs.close();
		     connection.close();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
