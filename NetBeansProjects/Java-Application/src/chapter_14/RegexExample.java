
package chapter_14;
import java.util.regex.*;
public class RegexExample {
    public static void main(String[] args) {
        String text = "cat bat mat cot cut";
        String pat = "\\Acat";
        String pat1 = "\\zcot";
        
        
        Pattern pattern = Pattern.compile(pat);
        Matcher matcher = pattern.matcher(text);
        
        while(matcher.find()){
            System.out.println(matcher.group());
        } 
        
        Pattern pattern1 = Pattern.compile(pat1);
        Matcher matcher1 = pattern1.matcher(text);
        
        while(matcher1.find()){
            System.out.println(matcher1.group());
        }
        
    }
}
