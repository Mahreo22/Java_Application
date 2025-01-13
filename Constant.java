//Write a java program to create a class called constant with a staic variable pi initilized to the value of pi.Then create a method called area to calculate the area of the circle with radius inputed by the user
//Write a java program to create a class called bank account with variable account number, balance and interest rate. Provide static method to get and set the static variables,create several bank account objects and print their details along with static variables. 
import java.util.Scanner;

public class Constant{
	static final double pi = 3.142;
	static int age = 17;
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		int radius = scan.nextInt();
		
		
		Constant.area(radius);
	}
	public static void area(int radius){
		double areaOfCircle;
		areaOfCircle = pi * radius * radius;
		System.out.printf("The area of the circle is %.2f",areaOfCircle);
		
		Constant.check();
	}
	public static void check(){
		if(age >= 18)
			System.out.printf("%nYou are responsile for the pregnancy");
		else
			System.out.printf("%nYou are still a small boy, it can't be you");
	}
}


//Math class demo
//.pow,.sqrt,.Pi,.min,.max,.double,.round,.random