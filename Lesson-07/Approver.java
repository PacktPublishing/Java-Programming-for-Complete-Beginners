package Demo;

public abstract class Approver {
	protected Approver successor;
	
	public void passToSuccessor(Approver successor) {
		this.successor = successor;
	}
	
	public abstract void processRequest(Loan loan);

}
