package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Mainclass {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
		
			Statement stmt=connection.createStatement();
		int status=	stmt.executeUpdate("insert into employee (fname,mobileno)values ('sneha','9087654534')");
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
