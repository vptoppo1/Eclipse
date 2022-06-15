package Java;

public class Test1 {
	
	String carModel;
	int carYear;
	int carPrice;
	
	public Test1(String cM, int cY, int cp) {
		carModel = cM;
		carYear = cY;
		carPrice = cp;
	}
	
	 public void carDetails() {
		 System.out.println("Model of the car is: "+ carModel);
		 System.out.println("Year of the car is: "+ carYear);
		 System.out.println("Price of the car is: "+ carPrice);
		 System.out.println("_________________________________");
	 }
}

//test