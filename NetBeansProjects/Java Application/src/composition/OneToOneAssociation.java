
package composition;

public class OneToOneAssociation {
    public static void main(String[] args) {
        Address address1 = new Address("No 56 HeisLaycon Street,","Dutse,","Zamfara State,","Nigeria.");
        Person person1 = new Person("Laycon",address1);
        person1.displayPerson();
        System.out.println("");
        
        
        Address address2 = new Address("No 87 Becca Close,","Sokoto,","Sokoto State,","Nigeria.");
        Person person2 = new Person("Becca",address2);
        person2.displayPerson();
        System.out.println("");
        
        Address address3 = new Address("No 14 Delight Avenue,","Port Harcourt,","Rivers State,","Nigeria.");
        Person person3 = new Person("Delight",address3);
        person3.displayPerson();
    }
 
}
