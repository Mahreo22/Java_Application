
package chapter_14;
import java.util.regex.*;
public class REQuestionMarkExample {
    public static void main(String[] args) {
        String [] words = {"colour","colour","colouur"};
        String pat = "colou?r";
        
        Pattern pattern = Pattern.compile(pat);
        
        for(String word : words){
            Matcher matcher = pattern.matcher(word);
            
            if(matcher.find()){
            System.out.println(matcher.group());
            }
            else{
            System.out.println("Not found");
            }
        }
    }
}
