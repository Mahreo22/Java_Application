
package chapter_11.exceptionhandling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);
        
        
        while(true){
            try{
                System.out.println("Enter a number");
                num = scan.nextInt();
                break;
            }
            catch(InputMismatchException e){
                scan.nextLine();
                System.out.println("Error: invalid input,please provide a valid integer");  
            }
        }
        System.out.printf( "%d is a valid integer %n", num);
    }
}
