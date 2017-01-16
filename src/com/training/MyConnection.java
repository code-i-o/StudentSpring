package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

private static Logger log = Logger.getLogger(FERSDataConnection.class);
	
	// New instance of Connection
	private static Connection connection = null;

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * 
	 * Open connection to access the underlying database. <br/>
	 * 
	 * @return Connection
	 *  
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 * 
	 */

	public static Connection createConnection() throws ClassNotFoundException,
			SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/festivaldatabase2", "root", "abcd1234");
		log.info("----Connection established with MYSQL database----");
		return connection;
	}

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * 
	 * Close connection accessing the underlying database. <br/>
	 * 
	 * @return Connection
	 *  
	 * @throws SQLException
	 * 
	 */

	public static void closeConnection() throws SQLException {
		log.info("----Connection closed with MYSQL database----");
		connection.close();
	}
}


