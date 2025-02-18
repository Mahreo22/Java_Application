
package chapter_10.polymorphism;

public class Dog extends Animal implements AnimalBehaviour{
    String breed;
    
    @Override public void sound(){
        System.out.println("Dog will bark whoof whoof ");
    }
    @Override public void poop(){
        System.out.println("All dog will poop plooooooddddhhhhhyyyygggghhh");
    }
}
