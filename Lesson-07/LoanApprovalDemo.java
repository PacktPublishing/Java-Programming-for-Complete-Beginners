package Demo;

public class LoanApprovalDemo {
	public static void main(String[] args) {
		// declaring variables
		Approver asstMgr, mgr, rtgsMgr;
		Loan loan;
		
		// creating the required class objects
		asstMgr = new AssistantBankManager();
		mgr = new BankManager();
		rtgsMgr = new RTGSManager();
		
		// setting the successor at each level
		asstMgr.passToSuccessor(mgr);
		mgr.passToSuccessor(rtgsMgr);
		
		// demonstring the loan approval process
		loan = new Loan("2021L-1234", 4000000, "Harish");
		asstMgr.processRequest(loan);
		
		loan = new Loan("2021L-3456", 2000000, "Krishna");
		asstMgr.processRequest(loan);
		
		loan = new Loan("2021L-3456", 500000, "Hitesh");
		asstMgr.processRequest(loan);
		
		loan = new Loan("2021L-123456", 6000000, "Rakesh");
		asstMgr.processRequest(loan);
		
		loan = new Loan("2021L-123456789", 500000, "Aminesh");
		//rtgsMgr.processRequest(loan);
		// mgr.processRequest(loan);
		asstMgr.processRequest(loan);
	}

}
