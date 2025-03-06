
package chapter_14;
import java.util.regex.MatchResult.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpNumberOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        long num = input.nextLong();
        String text = Long.toString (num);
        
        String pat = "[0-9]{10}";
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        
        if(matcher.find()){
            System.out.println("This is a valid phone number");
        }
        else{
             System.out.println("This is an invalid phone number");   
        }
        
    }
    
}
