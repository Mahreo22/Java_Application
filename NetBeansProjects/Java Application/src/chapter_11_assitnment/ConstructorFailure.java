
package chapter_11_assitnment;

public class ConstructorFailure {
    public static void main(String[] args) {
        try{
            SomeClass someObject = new SomeClass();
        }
        catch(Exception e){
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
