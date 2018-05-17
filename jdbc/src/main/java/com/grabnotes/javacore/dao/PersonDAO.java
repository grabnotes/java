/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonDAO {
	public void insert(String name, int age) {
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = MySqlConnect.getConnection();

			String insertsql = "insert into application_user(name,age) values (?,?)";
			ps = con.prepareStatement(insertsql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.executeUpdate();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if( ps != null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}

	public void getAll() {

		try(	PreparedStatement ps = con.prepareStatement(RETRIEVE_SQL)) {
			Connection con = MySqlConnect.getConnection();
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				System.out.println("Name: " + rs.getString("name") + " ;Age: " + rs.getInt("age"));
			}
		} catch (Exception e) {
			System.out.println("do same thing");
		}
	}

	public static final String INSERT_SQL = "insert into application_user(name,age) values (?,?)";

	public static final String RETRIEVE_SQL = "select id, name, age from application_user";
}
