
package chapter_14;

public class CharacterExample {
    public static void main(String[] args) {
        char ch1 = '%';
        char ch2 = '9';
        char ch3 = 'r';
    
        System.out.println(Character.isLetter(ch1));
        System.out.println(Character.isDigit(ch2));
        System.out.println(Character.toUpperCase(ch3));
    }
    
}
