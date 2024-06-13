package com.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
			PreparedStatement stmt=connection.prepareStatement("update employee set fname=? ,mobileno=? where id=2");
	          stmt.setString(1,"vanita");
	          stmt.setString(2,"9087654322");
	          int status=stmt.executeUpdate();
		      if(status>0) {
		    	  System.out.println("data is updated...");
		      }else {
		    	  System.out.println("not updated....");
		      }
		      connection.close();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
