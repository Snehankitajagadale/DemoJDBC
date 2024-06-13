package com.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {

	public static void main(String[] args){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/advancepractice", "root", "root");
			Statement stmt=con.createStatement();
			int status=stmt.executeUpdate("update employee set fname='simba',mobileno='8989898989' where id=1");
			if(status>0) {
				System.out.println("updated");
			}else {
				System.out.println("updated");
			}
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
