/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PersonDAO {
	public void insert(String name, int age) throws Exception {
		Connection con = MySqlConnect.getConnection();
		String insertsql = "insert into application_user(name,age) values (?,?)";
		PreparedStatement ps = con.prepareStatement(insertsql);
		ps.setString(1, name);
		ps.setInt(2, age);
		ps.executeUpdate();
	}
	
	public void getAll() throws Exception {
		Connection con = MySqlConnect.getConnection();
		PreparedStatement ps = con.prepareStatement(RETRIEVE_SQL);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next())
		{
			System.out.println("Name: " + rs.getString("name") + " ;Age: " + rs.getInt("age"));
		}
	}

	public static final String INSERT_SQL = "insert into application_user(name,age) values (?,?)";

	public static final String RETRIEVE_SQL = "select id, name, age from application_user";
}
