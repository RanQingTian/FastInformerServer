package BasicObjects;

import java.util.Date;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;;

public class Message {
	private static Integer message_counter=0;
	private final String id;
	public String importance_degree;
	public String title;
	public String content;
	public String type;
	public Set<String> acceptor_set;
	final private Date create_date;
	public Date send_date ;
	private MessageRecord record;
	
	
	public Message(Set<String> acceptor_set){
		id =message_counter.toString();
		message_counter++;
		create_date=new Date();
		this.acceptor_set=new HashSet<String>(acceptor_set);
		record=new MessageRecord(id,this.acceptor_set);
	}
	
	
}
