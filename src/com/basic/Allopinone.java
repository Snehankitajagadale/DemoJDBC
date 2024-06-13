package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Allopinone {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		   Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
		   Allopinone allInOne = new Allopinone();
         allInOne.insertRecord(connection, "snehankiiiiii", "9087654534");
           allInOne.updateRecord(connection);
           
           connection.close();
		   } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
			public void insertRecord(Connection connection, String fname, String mobileno) {
		      
		        try {
		            Statement stmt = connection.createStatement();
		            int status = stmt.executeUpdate("INSERT INTO employee (fname, mobileno) VALUES ('" + fname + "', '" + mobileno + "')");
		            if (status > 0) {
		                System.out.println("Data is inserted...");
		            } else {
		                System.out.println("Not inserted...");
		            }
		            stmt.close();
		        } catch (Exception e) {
		            e.printStackTrace();
		        }
			}
		        public void updateRecord(Connection connection) {
				      
			        try {
			            Statement stmt = connection.createStatement();
			            int status = stmt.executeUpdate("update employee set fname='simba',mobileno='8989898989' where id=6");
			            if (status > 0) {
			                System.out.println("Data is updated...");
			            } else {
			                System.out.println("Not updated...");
			            }
			            stmt.close();
			        } catch (Exception e) {
			            e.printStackTrace();
			        }
	}
}
