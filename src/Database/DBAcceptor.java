package Database;

import java.sql.Connection;

public class DBAcceptor extends DBBasic {
	static final private String tableName = "Acceptor";
	
	private int id;
	private int grade;
	private String institute;
	private String profession;
	private String classIn;
	private String name;
	private char sex;             //m for male, f for female
	private String dorm;
	private String dormRoom;
	private String telephone;
	
	DBAcceptor(int id){
		this.id = id;
		// extract data from DB
		// this.name = ...
		// ...
	}
	
//-------------- OBSOLETE -----------------
/*	DBAcceptor(int grade, String institute, String profession, String classIn, String name,
			char sex, String dorm, String dormRoom, String telephone){
		this.grade = grade;
		this.institute = institute;
		this.profession = profession;
		this.classIn = classIn;
		this.name = name;
		this.sex = sex;
		this.dorm = dorm;
		this.dormRoom = dormRoom;
		this.telephone = telephone;
	}*/   
	
	
	public static boolean update(Connection conn, int id, int grade, String institute, String profession, String classIn, String name,
			char sex, String dorm, String dormRoom, String telephone) {
		sql = "UPDATE " + tableName + " SET "
				+ "grade="  + grade + ", "
				+ "institute=" + "'" + institute + "', "
				+ "profession=" + "'" + profession + "', "
				+ "classIn=" + "'" + classIn + "', "
				+ "name=" + "'" + name + "', "
				+ "sex=" + "'" + sex + "', "
				+ "dorm=" + "'" + dorm + "', "
				+ "dormRoom=" + "'" + dormRoom + "', "
				+ "telephone=" + "'" + telephone + "'" 			
				+" WHERE id=" + id + ";"
				;
		System.out.println(sql);
		boolean result = execute(conn);
		return result;
	}
	
	
	public static boolean create(Connection conn, int grade, String institute, String profession, String classIn, String name,
			char sex, String dorm, String dormRoom, String telephone) {
		sql = "INSERT INTO " + tableName + " VALUES("
				+ "NULL, "
				+ grade + ","
				+ "'" + institute + "',"
				+ "'" + profession + "',"
				+ "'" + classIn + "',"
				+ "'" + name + "',"
				+ "'" + sex + "',"
				+ "'" + dorm + "',"
				+ "'" + dormRoom + "',"
				+ "'" + telephone + "'"
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
	public static String getTablename() {
		return tableName;
	}

	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		this.grade = grade;
	}



	public String getInstitute() {
		return institute;
	}



	public void setInstitute(String institute) {
		this.institute = institute;
	}



	public String getProfession() {
		return profession;
	}



	public void setProfession(String profession) {
		this.profession = profession;
	}



	public String getClassIn() {
		return classIn;
	}



	public void setClassIn(String classIn) {
		this.classIn = classIn;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public char getSex() {
		return sex;
	}



	public void setSex(char sex) {
		this.sex = sex;
	}



	public String getDorm() {
		return dorm;
	}



	public void setDorm(String dorm) {
		this.dorm = dorm;
	}



	public String getDormRoom() {
		return dormRoom;
	}



	public void setDormRoom(String dormRoom) {
		this.dormRoom = dormRoom;
	}



	public String getTelephone() {
		return telephone;
	}



	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}



	public int getId() {
		return id;
	}
	
}
