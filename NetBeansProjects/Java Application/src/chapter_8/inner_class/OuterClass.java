
package chapter_8.inner_class;


public class OuterClass {
   private String message = "This is an outter class";
    static int y = 50;
    
    public static void checkMe(){
        System.out.println("This is a static method");
    }
    
    class InnerClass{
        int x = 10;
        public void display(){
            System.out.printf("%s%n", message);
            System.out.printf("%d%n", x);
            System.out.println( y);
            
            OuterClass.checkMe();
        }
    }
    public static void main(String args[]){
        OuterClass outer = new OuterClass();
        
        OuterClass.InnerClass inner = outer.new InnerClass();
        
        inner.display();
    } 
}
