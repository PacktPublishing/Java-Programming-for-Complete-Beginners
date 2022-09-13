package Demo;

public class Loan {
	String loanID;
	String customerName;
	float loanAmount;
	
	public Loan(String id, float amt, String name) {
		this.loanID = id;
		this.loanAmount = amt;
		this.customerName = name;
	}
	
	public String get_loanID() {
		return this.loanID;
	}

	public float getLoanAmount() {
		return this.loanAmount;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
}
