package Demo;

public class BankAccountDemo {
	public static void main(String[] args) {
		// Intializing different customer type variables
		RegularCustomer regCust1, regCust2;
		EnterpriseCustomer entCust1, entCust2;
		
		// creating objects for Regular customer
		regCust1 = new RegularCustomer("R123", "Ramesh", "Domestic", 5000);
		regCust2 = new RegularCustomer("RB345", "Anand", "Business", 5000);
		
		// printing regular customer details and the final amount to pay
		System.out.println("Customer details are: ");
		regCust1.showCustomer();
		System.out.println("Final amount to pay is: "+ regCust1.get_final_amount(5,  3));
		
		System.out.println("\nCustomer details are: ");
		regCust2.showCustomer();
		System.out.println("Final amount to pay is: "+ regCust2.get_final_amount(5,  3));
		
		// creating objects for enterprise customer
		entCust1 = new EnterpriseCustomer("ES123", "Raghav", "SmallScale", 5000);
		entCust2 = new EnterpriseCustomer("EB345", "Mahindra", "BigScale", 5000);
		
		// printing enterprise customer details and the final amount to pay
		System.out.println("\nCustomer details are: ");
		entCust1.showCustomer();
		System.out.println("Final amount to pay is: "+ entCust1.get_final_amount(5,  3));
		
		System.out.println("\nCustomer details are: ");
		entCust2.showCustomer();
		System.out.println("Final amount to pay is: "+ entCust2.get_final_amount(5,  3));
		
	}

}
