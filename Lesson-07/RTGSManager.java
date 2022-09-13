package Demo;

public class RTGSManager extends Approver {

	@Override
	public void processRequest(Loan loan) {
		// TODO Auto-generated method stub
		if (loan.getLoanAmount() < 7000000){
			System.out.println(this.getClass().getSimpleName() + " Approved loan request id: " + loan.get_loanID() + " for customer - " + loan.getCustomerName());
		}
		else if(successor != null) {
			successor.processRequest(loan);
		}
	}

}
