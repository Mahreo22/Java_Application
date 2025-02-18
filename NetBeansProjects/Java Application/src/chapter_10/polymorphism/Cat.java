
package chapter_10.polymorphism;

public class Cat extends Animal{
    String colour;
    
    @Override public void sound(){
        System.out.println("All cats will meow meow");
    }
}
