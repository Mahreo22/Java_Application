
package chapter_10.polymorphism;

public class TestAnimal {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.name = "Laycon";
        dog.age = 2;
        dog.breed = "Nkita";
        dog.poop();
        
        System.out.println("Name of the dog is " + dog.name);
        System.out.println("The age  of the dog is " + dog.age + " years old");
        System.out.println("The breed of dog is " + dog.breed);
        
        dog.sound(2);
        
        Cat cat = new Cat();
        cat.sound(2);
        
        Cow cow = new Cow();
        cow.sound(2);
    }
}
