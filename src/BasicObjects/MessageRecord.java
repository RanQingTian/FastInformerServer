package BasicObjects;


import java.util.HashSet;
import java.util.Set;

public class MessageRecord {
	private Integer acceptor_counter;
	private final String id;
	private final String message_id;
	private Set<SingleRecord> records= new HashSet<SingleRecord>();
	
	public MessageRecord(String message_id, Set<String> acceptors) {
		this.id = acceptor_counter.toString() ;
		this.message_id = message_id;
		for(String str:acceptors)
			records.add(new SingleRecord(str));
	}
	
}
