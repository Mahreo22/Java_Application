
package chapter_14;
import java.util.regex.MatchResult.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionMarkColonExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String name = scan.nextLine();
        
        Pattern pattern = Pattern.compile("(?:Mr |Mrs |Miss)");
        Matcher matcher = pattern.matcher(name);
        
        if(matcher.find()){
            System.out.printf("%s you are welcome. %n",name);
        }
        else{
            System.out.println("Title should included in your name");
        }
    }
}
