package Demo;

public class RegularCustomer extends Customer{
	// class variables
	String customerID, customerName, customerType;
	double amount;
	
	RegularCustomer(String cid, String name, String type, double amt){
		super(cid, name, type, amt);
		
		this.customerID = cid;
		this.customerName = name;
		this.customerType = type;
		this.amount = amt;
	}

	@Override
	double get_final_amount(double interest, int year) {
		// TODO Auto-generated method stub
		double simple_interest = (this.amount * interest * year)/100;
		double amount = this.amount + simple_interest;
		
		if (this.customerType == "Domestic") {
			return amount - 500;
		}
		else if(this.customerType == "Business") {
			return amount - 100;
		}
		
		return amount;
	}

}
