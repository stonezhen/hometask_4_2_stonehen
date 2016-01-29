package CabCompany;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class  filereadwrite {
	

	
	public static void main(String[] args) throws FileNotFoundException {
			
		File file = new File("stonezhen");			
		Scanner input = new Scanner(System.in);
	
		int seat = input.nextInt();
		double fuelconsumption = input.nextInt();
		String color = input.next();
		CabService cabservice = new CabService();

		Cab  Customercab = cabservice.getCab(seat,fuelconsumption,color);

		color = Customercab.getcolor();
		filereadwrite.writeColorToFile(color, file);
		
		filereadwrite.readColorFromFile(file);
	}

	
	
	public static void writeColorToFile(String color, File file ) throws FileNotFoundException{
		
		PrintWriter outputToFile = new PrintWriter(file);

		outputToFile.print(color);
		outputToFile.close();
		
	}
	

	public static void readColorFromFile(File file) throws FileNotFoundException{
	
		Scanner inputFromFile =  new Scanner(file);
			
			String color  = inputFromFile.next();
			
			System.out.println("The color is : "+color);
		
	}
  }
	
