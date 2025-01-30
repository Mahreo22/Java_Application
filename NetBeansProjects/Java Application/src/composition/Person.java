

package composition;

public class Person {
    String name;
    Address address;
    
    public Person(String name,Address address){
        this.name = name;
        this.address = address;
    }
    public void displayPerson(){
        System.out.printf("%s lives in ",name);
        address.displayAddress();
    }
}
