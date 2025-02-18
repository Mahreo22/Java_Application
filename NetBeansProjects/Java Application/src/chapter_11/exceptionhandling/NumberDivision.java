
package chapter_11.exceptionhandling;
import java.util.Scanner;

public class NumberDivision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int divide;
        System.out.println("Enter first number");
        int num1 = scan.nextInt();
        
        System.out.println("Enter second number");
        int num2 = scan.nextInt();
  
        try{
         divide = num1/num2;
        }
        catch(ArithmeticException e){
           System.out.println("Error: first number cannot be divided by zero"); 
        }
        finally{
        if(num1 > num2){
            System.out.printf("%d is greater than %d%n",num1,num2);
        }
        else{
            System.out.printf("%d is not greater than %d%n",num1,num2);
        }
        }
    }
}
