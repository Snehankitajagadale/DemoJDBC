package com.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class SelectAll {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
			PreparedStatement stmt=connection.prepareStatement("Select * from  employee ");
	          ResultSet rs =stmt.executeQuery();
	         
	          while(rs.next()) {
	        	  int id=rs.getInt("id");
	        	  String fname=rs.getString("fname");
	        	  String mno=rs.getString("mobileno");
	        	  System.out.println("id is:"+id+ " " +"fnameis:"+fname+" "+"mobileno is:"+mno);
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
