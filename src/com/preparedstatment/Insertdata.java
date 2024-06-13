package com.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Insertdata {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
			PreparedStatement stmt=connection.prepareStatement("insert into employee (fname,mobileno) values (?,?)");
	          stmt.setString(1,"sneha");
	          stmt.setString(2,"9087654322");
	          int status=stmt.executeUpdate();
		      if(status>0) {
		    	  System.out.println("data is inserted...");
		      }else {
		    	  System.out.println("not inserted....");
		      }
		      connection.close();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
