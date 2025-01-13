public class DanglingElseProblem{
	public static void main(String[] args){
		int x = 22;
		int y = 15;
		
		if (x > 5)
			if (y >5){
				System.out.println("x and y are greater than 5");
			}
		else
				System.out.println("x is <= 5");
	}
}