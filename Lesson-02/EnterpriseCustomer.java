package Demo;

public class EnterpriseCustomer extends Customer{
	
	EnterpriseCustomer(String cid, String name, String type, double amt) {
		super(cid, name, type, amt);
		// TODO Auto-generated constructor stub
		this.customerID = cid;
		this.customerName = name;
		this.customerType = type;
		this.amount = amt;
		
	}
	// class variables
	String customerID, customerName, customerType;
	double amount;

	@Override
	double get_final_amount(double interest, int year) {
		// TODO Auto-generated method stub
		double simple_interest = (this.amount * interest * year)/100;
		
		double amount = this.amount + simple_interest;
		
		if(this.customerType == "SmallScale") {
			return amount - 100;
		}
		else if(this.customerType == "BigScale") {
			return amount - 50;
		}
		
		return amount;
	}

}
