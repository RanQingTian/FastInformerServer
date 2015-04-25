package Database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DBBasic {
	static String sql;
	
	boolean create(Connection conn) {
		return execute(conn);
	}
	
	static boolean execute(Connection conn) {
		try {
			Statement stmt = conn.createStatement();
			int result = stmt.executeUpdate(sql);
			
			if (result <= 0){
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
}
