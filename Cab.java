package CabCompany;

public class Cab{
	
	private int seat;

	private double FuelConsumption;
	
	private String Color;
	
	public Cab(){
		
	}
	
	public Cab(int seat, double fuelConsumption){
		 
		this.seat = seat;
		
		this.FuelConsumption = fuelConsumption;
		 
	}

	public Cab(int seat, double fuelConsumption, String color){
		 
		this.seat = seat;
		
		this.FuelConsumption = fuelConsumption;

		this.Color = color;
		 
	}

	
	
	public double getFuelConsumption(){
		
		System.out.println("Fuel consumption is: "+this.FuelConsumption);
		return 0;
				
	}
	
	public int getSeats(){
		
		return this.seat;
	}

	public String getcolor(){
		
		return this.Color;
	}

		
}