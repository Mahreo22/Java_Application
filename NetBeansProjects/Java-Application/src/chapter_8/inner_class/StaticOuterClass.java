
package chapter_8.inner_class;

public class StaticOuterClass {
    private static String message = "This is an outter class";
    static int y = 50;
    
    public static void checkMe(){
        System.out.println("This is a static method");
}
    
    static class StaticInnerClass{
        int x = 10;
        public void display(){
            System.out.printf("%s%n", message);
            System.out.printf("%d%n", x);
            System.out.println( y);
            
            OuterClass.checkMe();
        }
    }
    public static void main(String[] args) {
        StaticOuterClass.StaticInnerClass inner = new 
        StaticOuterClass.StaticInnerClass();
        
        inner.display();
    }
}
