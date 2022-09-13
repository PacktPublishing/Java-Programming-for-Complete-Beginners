package Demo;

public class NetflixPlanFactory {
	public NetflixPlan getPlan(String plan) {
		
		if (plan == null) {
			return null;
		}
		
		if (plan.equalsIgnoreCase("basic")) {
			return new Basic();
		}
		else if (plan.equalsIgnoreCase("standard")) {
			return new Standard();
		}
		else if (plan.equalsIgnoreCase("premium")) {
			return new Premium();
		}
		
		return null;
		
	}

}
