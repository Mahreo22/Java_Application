import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner scan =new Scanner (System.in);
		
		String name;
		int score;
		
		System.out.print("Enter name: ");
		name = scan.nextLine();
		
		System.out.print("Enter score: ");
		score = scan.nextInt();
		int grade = score/10;
		
		switch(grade){
			case 10:
			case 9:
					System.out.print(name + " your grade is outstanding");
			break;
			
			case 8:
			case 7:
			case 6:
					System.out.print(name + " your grade is excellent");
			break;
			
			case 5:
					System.out.print(name + " your grade is good");
			break;
			
			case 4:
					System.out.print(name + " your grade is average");
			break;
			
			case 3:
			case 2:
			case 1:
			case 0:
					System.out.print(name + " your grade is very poor");
			break;
			
			default:
					System.out.print("Invalid input");
		}
		
		
	}
}