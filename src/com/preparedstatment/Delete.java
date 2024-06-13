package com.preparedstatment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
			PreparedStatement stmt=connection.prepareStatement("delete from  employee where id=?");
			 stmt.setInt(1,4);
	          int status=stmt.executeUpdate();
		      if(status>0) {
		    	  System.out.println("data deleted...");
		      }else {
		    	  System.out.println("not deleted....");
		      }
		      connection.close();
		} catch (ClassNotFoundException e) {
		
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
