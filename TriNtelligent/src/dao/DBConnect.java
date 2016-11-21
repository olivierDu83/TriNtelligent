package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	
	private final static String ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final static String DB_URL = "jdbc:oracle:thin:stag17/stag17pw@junon:1521:AFPA";
	
	

	private static Connection connect;

	
	static {
		try {
			// Loads JDBC Oracle driver
			Class.forName(ORACLE_DRIVER);
			connect=DriverManager.getConnection(DB_URL);
		}
		// If exception, JDBC driver is not linked to the Java project
		catch(ClassNotFoundException e){
			System.err.println("Oracle : Le driver n'a pas été trouvé."); 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnect() {

		return connect;
	}
	
}


