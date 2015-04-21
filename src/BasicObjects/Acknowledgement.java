package BasicObjects;

import java.util.Date;

public class Acknowledgement {
	private final String acceptor;
	public final Date check_date;
	
	public Acknowledgement(String acceptor) {
		this.acceptor= acceptor;
		check_date= new Date();
	}

}
