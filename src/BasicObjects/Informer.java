package BasicObjects;

import java.util.ArrayList;

public class Informer {
	private final String id;
	public String department;
	public String duty;
	public ArrayList<Informer> branch_list;
	public ArrayList<Acceptor> acceptor_list;
	
	public Informer(String id) {
		this.id = id;
	}
}
