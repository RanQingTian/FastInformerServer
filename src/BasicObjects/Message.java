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
	private Set<MessageRecord> record;
	private String send_status="Not Send";
	
	
	public Message(){
		id =message_counter.toString();
		message_counter++;
		create_date=new Date();
	}
	
//	public boolean sendMessage(String importance_degree,String title,String content,String type,
//			Set<String> acceptor_set){
//		this.importance_degree= importance_degree;
//		this.title= title;
//		this.content= content;
//		this.type =type;
//		this.acceptor_set=new HashSet<String>(acceptor_set);
//		this.record= new HashSet<MessageRecord>();
//		for(String str:acceptor_set)
//			record.add(new MessageRecord(id,str));
//		send_date= new Date();
//		//method() 调用一个方法将消息发送给Acceptor,如果发送成功则返回true
//		return false;
//		
//	}
	
	public void setStatus(String status){
		send_status=status;
	}
	
	public boolean copyTo(Message image) throws CloneNotSupportedException{
		if(image.id!=this.id) return false;
		image=(Message) this.clone();//需重写clone方法
		return true;
	}
	
	
}
