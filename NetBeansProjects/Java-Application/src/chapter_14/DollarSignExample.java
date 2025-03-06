
package chapter_14;
import java.util.regex.*;

public class DollarSignExample {
    public static void main(String[] args) {
        String text = "cat pat mat rat";
        String pat = "cat$";
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        
        if(matcher.find()){
            System.out.println("found");
        }
        else{
           System.out.println("not found"); 
        }
    }
}
