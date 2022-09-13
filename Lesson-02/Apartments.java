package Demo;

public class Apartments extends HouseArchitecture{

	@Override
	float getPrice() {
		// TODO Auto-generated method stub
		return 8000000;
	}

	@Override
	String getListOfBanksProvideLoan() {
		// TODO Auto-generated method stub
		return "SBI,HDFC,ICICI,AXIS";
	}

}
