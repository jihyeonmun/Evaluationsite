package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseUtil {
	public static Connection getConnection() {
		try {
			String dbURL = "jdbc:mysql://13.125.217.239:3306/LectureEvaluation?useUnicode=true&useSSL=false&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			String dbID = "finalproject";
			String dbPassword = "1212";
			Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection a = DriverManager.getConnection(dbURL, dbID, dbPassword);
			return a;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
