
package chapter_14;

public class StringsExample {
    public static void main(String[] args) {
        String name = "John";
        
        String colour = new String ();
        System.out.println(colour);
        
        String copy = new String(name);
        System.out.println(copy);
        
        char[] letter = {'J','a','v','a'};
        String myLetters = new String(letter);
        System.out.println(myLetters);
        
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        
        String str = "Programming";
        String str1 = "Java Programming";
        String str2 = "I love java!";
        String str3 = "Banana";
        String sentence = "Java is fun";
        String [] words = sentence
        System.out.println(str.substring(3));
        System.out.println(str1.substring(5, 16));
        System.out.println(str2.indexOf("java"));
        System.out.println(str3.replace('a', 'o'));
        System.out.println(str3.replace('a', 'o'));
        
        
        //StringBuilder,buffer and regex
        
    }
 
}
