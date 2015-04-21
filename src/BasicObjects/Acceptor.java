package BasicObjects;

import java.util.Set;;

public class Acceptor {
	private final String id;
	public String grade;
	public String institute;
	public String profession;
	public String class_in;
	private String name;
	private String sex;
	public String hostel;
	public String hostel_room;
	public String telephone;
	private Set<Message> message_set;
	private Set<Informer> informer_set;
	
	public Acceptor(String id,String name) {
		this.id = id;
		this.name = name;
	}
	public void setSex(String sex){
		this.sex= sex;
	}
	
}
