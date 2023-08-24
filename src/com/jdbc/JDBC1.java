package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC1 {

	public static void main(String[] args) {
		
		try {
			//1.Load & Register the Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2.Establish the connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
			
			//3.create statement object
			Statement s=con.createStatement();
			
			/*// 4.Executing the query
			//create table
			s.executeUpdate("create table trainer(eno int,ename varchar(20),esal int)");
			
			//Insert the values
			s.executeUpdate("insert into trainer values (1, 'Bharath',30000)");
			s.executeUpdate("insert into trainer values (2, 'Ragunath',34000)");
			s.executeUpdate("insert into trainer values (3, 'Sunny',35000)");*/
			
			//Delete the record
			//s.executeUpdate("delete from trainer where eno=1 ");
			
			//Updating the table
			s.executeUpdate("update trainer set ename='Bharath' where eno=2");


           //5.close connections
			s.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
