import java.util.Scanner;
public class MethodOverloading{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("**********Menu**********");
		System.out.println("Enter 1 to calculate perimeter of square");
		System.out.println("Enter 2 to calculate perimeter of rectangle");
		
		
		int option = scan.nextInt();
		switch(option){
			case 1 :
			{
				System.out.println("Enter the length of square");
				int length = scan.nextInt();
				
				MethodOverloading.shape(length);
			}		
			break;
			
			case 2 :
			{
				System.out.println("Enter the length of square");
				int length = scan.nextInt();
				
				System.out.println("Enter the breadth of square");
				int breadth = scan.nextInt();
				
				MethodOverloading.shape(length,breadth);
			}
			break;	
				
			default:
			System.out.println("Invalid input");
		}
	}
	public static void shape(int length){
		int perimeterOfSquare = 4*length;
		System.out.printf("The perimeter of a square is %d",perimeterOfSquare);
	}
	public static void shape(int length,int breadth){
		int perimeterOfRectangle = length*breadth;
		System.out.printf("The perimeter of a rectangle is %d",perimeterOfRectangle);
	}
}