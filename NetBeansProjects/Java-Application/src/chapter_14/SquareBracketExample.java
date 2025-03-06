
package chapter_14;
import java.util.regex.*;

public class SquareBracketExample {
    public static void main(String[] args) {
        String text = "cat bat mat cot cut";
        String pat = "[cmb]";
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        }
        
    }
}
