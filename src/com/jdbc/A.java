package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class A {
	
	public void createTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "root");
			
			Statement s= con.createStatement();
			
			s.executeUpdate("create table hr(hno int primary key auto_increment, hname varchar(30) not null, hsal int not null)");
			
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
	
	public void insert(String name, int sal) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			
			Statement s= con.createStatement();
			
			s.executeUpdate("insert into hr(hname,hsal) values('"+name+"',"+ sal+")");
			
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
	public void delete( int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			
			Statement s= con.createStatement();
			
			s.executeUpdate("delete from hr where hno="+id);
			
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
	public void update( String name,int sal,int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/abc","root","root");
			
			Statement s= con.createStatement();
			
			s.executeUpdate("update hr set hname='"+name+"',hsal="+sal+" where hno="+id);
			
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
