package BasicObjects;

import java.util.Date;

public class SingleRecord {
	@SuppressWarnings("unused")
	private Integer id;
	@SuppressWarnings("unused")
	private final String acceptor;
	public String status;
	public final Date date;
	
	public SingleRecord(String acceptor) {
		this.acceptor= acceptor;
		date= new Date();
	}
	
	public void setId(int id){
		this.id=id;
	}
}
