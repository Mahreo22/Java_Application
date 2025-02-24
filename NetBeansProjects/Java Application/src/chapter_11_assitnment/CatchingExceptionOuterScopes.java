
package chapter_11_assitnment;


public class CatchingExceptionOuterScopes {
    public static void someMethod(){
        try{
            someMethod2();
        }
        catch(NullPointerException e){
            System.out.println("Caught NullPointer Exception in someMethod.");
            System.out.println(e.getMessage());
        }
    }
    public static void someMethod2(){
        int x = 5/10;
        String s = null;
        s.length();
    }
    public static void main(String[] args) {
        try{
            someMethod2();
        }
        catch(ArithmeticException e){
            System.out.println("Caught Arithmetic Exception in someMethod.");
            System.out.println(e.getMessage());
        }
    }
 
}
