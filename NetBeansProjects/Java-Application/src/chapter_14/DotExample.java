
package chapter_14;
import java.util.regex.*;

public class DotExample {
    public static void main(String[] args) {
        String text = "cat pat mat rat cut cot";
        String pat = "c.t";
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
