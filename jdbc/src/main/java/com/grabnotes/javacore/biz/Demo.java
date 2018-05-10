/** Copyright 2018 grabnotes.com
 * @author Rathna Kaliannan
 * All rights reserved
*/
package com.grabnotes.javacore.biz;

import com.grabnotes.javacore.dao.MySqlConnect;
import com.grabnotes.javacore.dao.PersonDAO;

public class Demo {
	public static void main(String args[]) throws Exception {
		try {
			MySqlConnect.getConnection();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		PersonDAO personDao = new PersonDAO();
		personDao.insert("jim", 25);
		personDao.getAll();
		
	}
}
