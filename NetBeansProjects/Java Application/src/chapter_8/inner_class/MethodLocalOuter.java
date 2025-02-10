
package chapter_8.inner_class;

public class MethodLocalOuter {
    public void outerMethod(){
        System.out.println("This is an outer method");
        
        class MethodLocalInner{
            public void display(){
                System.out.println("This is an inner class method");
            }
        }
        MethodLocalInner inner = new MethodLocalInner();
        inner.display();
    }
    public static void main(String[] args) {
        MethodLocalOuter outer = new MethodLocalOuter();
        outer.outerMethod();
    }
    
}
