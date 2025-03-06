
package chapter_14;
import java.util.regex.*;
public class CaretExample {
    public static void main(String[] args) {
        String text = "cat pat mat rat";
        String pat = "^cat";
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        
        System.out.println(matcher.group());
        
    }
 
}
