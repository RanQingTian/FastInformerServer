package Database;

import java.sql.Connection;

public class DBInformer extends DBBasic {
	static final private String tableName = "Informer";
	
	private int id;
	private String department;
	private String duty;
	private String principal;
	
	DBInformer(int id){
		this.id = id;
		// extract data from DB
		// this.name = ...
		// ...
	}
	
	
	public static boolean update(Connection conn, int id, String department, String duty, String principal) {
		sql = "UPDATE " + tableName + " SET "
				+ "department="  + department + ", "
				+ "duty=" + "'" + duty + "', "
				+ "principal=" + "'" + principal + "'" 			
				+" WHERE id=" + id + ";"
				;
		System.out.println(sql);
		boolean result = execute(conn);
		return result;
	}
	
	
	public static boolean create(Connection conn, int id, String department, String duty, String principal) {
		sql = "INSERT INTO " + tableName + " VALUES("
				+ "NULL, "
				+ "'" + department + "',"
				+ "'" + duty + "',"
				+ "'" + principal + "'"
				+ ");"
				;
		
		boolean result = execute(conn);
	//	setId();		//set ID generated automatically.
		return result;
	}
	
	
	static boolean delete(Connection conn, int id){
		sql = "DELETE FROM " + tableName + " WHERE `id`='" + id +"'";
		
		boolean result = execute(conn);
		return result;
	}

	// Getters and Setters
	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getDuty() {
		return duty;
	}


	public void setDuty(String duty) {
		this.duty = duty;
	}


	public String getPrincipal() {
		return principal;
	}


	public void setPrincipal(String principal) {
		this.principal = principal;
	}


	public int getId() {
		return id;
	}
	
}
