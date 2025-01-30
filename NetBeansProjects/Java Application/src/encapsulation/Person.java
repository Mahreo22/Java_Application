
package encapsulation;

public class Person {
   private String name;
   private  String age;
   private  String country;
  
   public Person(String name,String age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }
   Person(){
        name = "Unknown";
        age = "Unknown";
        country = "Unknown";
        
       
   }
   public void display(){
        System.out.printf("Name : %s%n ", getName());
         System.out.printf("Age : %s%n ", getAge());
          System.out.printf("Country : %s%n ", getCountry());
           
    }
   public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAge(String age) {
        this.age = age;
    }
    
    public void setCountry(String country) {
        this.country = country;
    }
}
