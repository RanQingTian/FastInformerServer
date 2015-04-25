package Database;

import java.sql.Connection;
import java.sql.Date;

public class DBMessage extends DBBasic {
	static final private String tableName = "Message";
	
	private int id;
	private int importanceDegree;
	private String title;
	private String content;
	private String type;
	private Date createDate;
	private Date sendDate;
	private int sendStatus;
	private int acceptorID;
	
	DBMessage(int id){
		this.id = id;
		// extract data from DB
		// ...
	}
	
	
	public static boolean update(Connection conn, int id, int importanceDegree, String title, String content,
			String type, Date createDate, Date sendDate, int sendStatus, int acceptorID) {
		sql = "UPDATE " + tableName + " SET "
				+ "importanceDegree="  + importanceDegree + ", "
				+ "title=" + "'" + title + "', "
				+ "content=" + "'" + content + "', "
				+ "type=" + "'" + type + "', "
				+ "createDate=" + "'" + createDate + "', "
				+ "sendDate=" + "'" + sendDate + "', "
				+ "sendStatus=" + "'" + sendStatus + "', "
				+ "acceptorID=" + "'" + acceptorID + "'" 			
				+" WHERE id=" + id + ";"
				;
		System.out.println(sql);
		boolean result = execute(conn);
		return result;
	}
	
	
	public static boolean create(Connection conn, int id, int importanceDegree, String title, String content,
			String type, Date createDate, Date sendDate, int sendStatus, int acceptorID) {
		sql = "INSERT INTO " + tableName + " VALUES("
				+ "NULL, "
				+ "'" + importanceDegree + "',"
				+ "'" + title + "',"
				+ "'" + content + "',"
				+ "'" + type + "',"
				+ "'" + createDate + "',"
				+ "'" + sendDate + "',"
				+ "'" + sendStatus + "',"
				+ "'" + acceptorID + "'"
				+ ");"
				;
		
		boolean result = execute(conn);
		return result;
	}
	
	// Getters and Setters
	static boolean delete(Connection conn, int id){
		sql = "DELETE FROM " + tableName + " WHERE `id`='" + id +"'";
		
		boolean result = execute(conn);
		return result;
	}


	public int getImportanceDegree() {
		return importanceDegree;
	}


	public void setImportanceDegree(int importanceDegree) {
		this.importanceDegree = importanceDegree;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public Date getSendDate() {
		return sendDate;
	}


	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}


	public int getSendStatus() {
		return sendStatus;
	}


	public void setSendStatus(int sendStatus) {
		this.sendStatus = sendStatus;
	}


	public int getAcceptorID() {
		return acceptorID;
	}


	public void setAcceptorID(int acceptorID) {
		this.acceptorID = acceptorID;
	}


	public static String getTablename() {
		return tableName;
	}


	public int getId() {
		return id;
	}
	
}
