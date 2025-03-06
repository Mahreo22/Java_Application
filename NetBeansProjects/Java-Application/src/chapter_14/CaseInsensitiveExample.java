
package chapter_14;
import java.util.regex.*;
import java.util.Scanner;
        
public class CaseInsensitiveExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scan.nextLine();
        
        
        /*
        String pat = "(?i)[A-Z|a-z ]{10,}";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(name);
        
        if(matcher.find()){
            System.out.printf("Welcome,your name is %s%n",name);//true
        }
        else{
            System.out.println("The name should be more than 10 characters %n");//true
        }
        */
        
        
        String pat = "(Mr|Mrs|Miss)[A-Z|a-z ]{10,}";
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(name);
        
        if(matcher.find()){
            System.out.printf("Welcome,your name is %s%n",name);//true
        }
        else{
            System.out.println("The name should be more than 10 characters %n");//true
        }
        
    }
}
