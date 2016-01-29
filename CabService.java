package CabCompany;

public class CabService {

	public CabService(){
		
	}
	public static Cab getCab(int seat, double fuelConsumption, String color){

	return new Cab(seat, fuelConsumption,color);   

	}

}