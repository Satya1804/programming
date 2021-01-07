package pack ;
import java.util.Scanner; 

public class DistanceConverter{
	

	Scanner s = new Scanner(System.in);
	double km , meter , mile , input ;
		
	public void metersToKm(){
		input = s.nextDouble();
		km = input*0.001; 
		System.out.println(input +" meters = "+km +" Kilometers");	
	}
		
	public void milesToKm(){
		input = s.nextDouble();
		km = input*1.609344; 
		System.out.println(input +" miles = "+km +" Kilometers");		
	}

	public void kmToMeters(){
		input = s.nextDouble();
		meter = input/0.001; 
		System.out.println(input +" Kilometers = "+meter +" meters");		
	}

	public void kmToMiles(){
		input = s.nextDouble();
		mile = input/1.609344; 
		System.out.println(input +" Kilometers = "+ mile +" miles");		

	}
	
}