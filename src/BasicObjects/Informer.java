package BasicObjects;

import java.util.Set;

public class Informer {
	private final String id;
	public String department;
	public String duty;
	private Informer principal;
	public Set<Informer> branch_set;
	public Set<Acceptor> single_acceptor_set;
	public Set<Set<Acceptor>> group_acceptor_set;
	
	public Informer(String id,Informer principal) throws CloneNotSupportedException {
		this.id = id;
		this.principal= (Informer) principal.clone();
	}
	
	public void addSingleAcceptor(Acceptor acceptor){
		single_acceptor_set.add(acceptor);
	}
	
	public void addGroupAcceptor(Set<Acceptor> group_acceptor){
		group_acceptor_set.add(group_acceptor);
	}
}
