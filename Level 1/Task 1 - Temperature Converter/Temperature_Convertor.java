package Level_1;
import java.util.*;

public class Temperature_Convertor {
	
	public static void calcCelsius(double temp) {
		
		double cel=(temp-32)*5/9;
		System.out.println("Your Temperature In Celsius is : "+cel);
	}
	public static void calcFahrenheit(double temp) {
		
		double fah=(temp * 9/5 + 32);
		System.out.println("Your Temperature in Fahrenheit is : "+fah);
	}
	public static void main(String[] args) {
		
		//User Input
		Scanner sc=new Scanner(System.in);
		System.out.println("Unit you want to Convert your Temperature");
		System.out.println("C for Celsius and F for Fahrenheit");
		System.out.print("Enter Temperature Unit : ");
		char unit=sc.next().charAt(0);
		
		System.out.print("Enter Your Temperature : ");
		double temp=sc.nextDouble();
		
		if(unit == 'c' || unit == 'C') {
			calcFahrenheit(temp);
		}else if(unit == 'f' || unit == 'F') {
			calcCelsius(temp);
		}else {
			System.out.println("You Entered Invalid Temperature Unit...!");
		}
		
	}
}
	