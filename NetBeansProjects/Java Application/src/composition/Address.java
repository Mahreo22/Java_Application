
package composition;

public class Address {
    String street;
    String city;
    String state;
    String country;
    
    public Address(String street,String city,String state,String country){
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        
    }
    public void displayAddress(){
        System.out.printf("%s %s %s %s%n", street,
        city,state,country);
    }
}
