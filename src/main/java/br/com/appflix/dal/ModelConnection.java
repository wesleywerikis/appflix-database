package br.com.appflix.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ModelConnection {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/appflix_db";
	private static final String USER = "root";
	private static final String PASSWORD = "senha";

	private static Connection connection;

	public static Connection getConnection() {
		try {
			if (connection == null || connection.isClosed()) {
				Class.forName(DRIVER);
				connection = DriverManager.getConnection(URL, USER, PASSWORD);
			}
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println("Error connecting to database: " + e.getMessage());
		}
		return connection;
	}

	public static void closeConnection() {
		if (connection != null) {
			try {
				connection.close();
				connection = null;
			} catch (SQLException e) {
				System.err.println("Error closing database connection: " + e.getMessage());
			}
		}
	}
}