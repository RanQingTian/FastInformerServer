package BasicObjects;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class MessageRecord {
	private Integer acceptor_counter;
	private final String id;
	private final String message_id;
	private final String acceptor;
	public String status;
	public Date check_date;
	
	public MessageRecord(String message_id, String acceptor) {
		this.id = acceptor_counter.toString() ;
		this.message_id = message_id;
		this.acceptor= acceptor;
	}
	
	public void setCheckDate(){
		check_date=new Date();
	}
}
