
package encapsulation;
import java.util.Scanner;



public class TestEncapsulation {
    public static void main (String[] args){
        /*Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter account number: ");
        String acctNumber = scan.nextLine();
        
         
        System.out.print("E1234567890nter account name: ");
        String acctName = scan.nextLine();
        
         
        System.out.print("Enter bvn: ");
        String bvn = scan.nextLine();
        
         
        System.out.print("Enter account balance: ");
        double balance = scan.nextDouble();
        scan.nextLine();
        
         
        System.out.print("Enter account type:");
        String acctType = scan.nextLine();*/
        System.out.println("===============");
        System.out.println("");
        
        
        EncapsulationPractice encap = new EncapsulationPractice("1234567837","Laycon");
        encap.display();
        System.out.println();
        
        EncapsulationPractice acc1 = new EncapsulationPractice("1267765437","Mario");
        acc1.display();
        System.out.println();
        
        EncapsulationPractice acc2 = new EncapsulationPractice("7765567837","Lasis");
        acc2.display();
        System.out.println();
    }
    
}
