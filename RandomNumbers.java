import java.util.Random;
public class RandomNumbers{
	public static void main(String args[]){
		Random random = new Random();
		
		//create a variaable to store the random number generated
		int randomNum = random.nextInt();
		
		//Print the random number
		System.out.printf("Random number is : %d%n",randomNum);
		
		//Generating a random int number within a range
		int randomNumInRange = random.nextInt(20);
		
		System.out.printf("Random number in range is : %d%n",randomNumInRange);
		
		//generating a float-point number
		double floatpointNum = random.nextDouble();
		
		//print
		System.out.printf("Random number in double is : %.2f%n",floatpointNum);
		
		//Generating a float-point number within a range
		double min = 10.0;
		double max =20.0;
		
		double randomFloatpointInRange = min + (max - min)* random.nextDouble();
		
		//print
		System.out.printf("Random double number in range is : %.2f%n",randomFloatpointInRange);
		
		//Generating a random boolean value
		boolean booleanValue = random.nextBoolean();
		
		//print
		System.out.printf("Random Boolean Value is : %b%n",randomFloatpointInRange);
	}
}