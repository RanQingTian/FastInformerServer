package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	
	private String url;
	private String username;
	private String password;
	
	static Connection conn;
	
	//---------------- JUST FOR TEST! --------------------
/*	public static void main(String[] arg){
		boolean connResult;
		
		DBConnector dbconn = new DBConnector();
		connResult = dbconn.connectDB();
		
		if(connResult == true){
			System.out.println("connect successfully.");
		}
		else {
			System.out.println("connect failed.");
		}
		
		boolean  rs;
		
		 rs = DBAcceptor.create(conn, 1, null, null, null, "beUp", 'm', null, null, null);
		// rs = DBAcceptor.delete(conn, 3);
		
		if(rs == false)
		{
			System.out.println("failed");
		}
	}*/
	//---------------- JUST FOR TEST! --------------------
	
	public DBConnector(){
		// DEFAULT: localhost
		this.url = "jdbc:mysql://localhost:3306/test";
		this.username = "system";
		this.password = "123456";
	}
	
	// Set your DB here 
	public DBConnector(String url, String username, String password){
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	public boolean connectDB(){
		try{   
			//Load driver class of MySql   
			Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				System.out.println("Loading failed: cannot find driver class");   
				e.printStackTrace();
				return false;
				}
		
		try{
				conn = 
					DriverManager.getConnection(url, username, password);
			} catch (SQLException se) {
				System.out.println("Connection failed");
				se.printStackTrace();
				return false;
			}
		
		return true;
	}
	
	// Getters and Setters
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
