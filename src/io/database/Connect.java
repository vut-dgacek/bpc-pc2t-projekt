package io.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
	private Connect() {}
	private static volatile Connection con;
	
	public static Connection getConnection() {
		if (con == null) {
			synchronized (Connect.class) {
				if (con == null) {
					try {
						Class.forName("org.sqlite.JDBC");
						con = DriverManager.getConnection("jdbc:sqlite:data/database.db");
					} catch (SQLException | ClassNotFoundException e) {
						e.printStackTrace();
					}
				}
			}
		}
		return con;
	}
	
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
