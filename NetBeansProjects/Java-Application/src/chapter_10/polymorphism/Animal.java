
package chapter_10.polymorphism;

public abstract class Animal {
    String name;
    int age;
    
    public abstract void sound();
 
    public void sound(int numberOfTimes){
        for(int i = 1;i <= numberOfTimes;i++){
            sound();
        }
    }
}
