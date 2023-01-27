package assignment.creditcard;
import java.util.Scanner;
public class CreditCard 
{
    public static void main( String[] args ) throws CloneNotSupportedException
    {
        CreditCardLogic obj = new CreditCardLogic("saran",1234567890,1225);
        CreditCardLogic obj2 = obj.credit();
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Card Number:");
        Integer newnum =sc.nextInt();
        sc.close();
        
        System.out.println(obj2.checkNum(newnum));
        
    }
}
