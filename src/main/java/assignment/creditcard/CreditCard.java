package assignment.creditcard;
import java.util.Scanner;
import java.util.logging.Logger;
public class CreditCard 
{
    public static void main( String[] args )
    {
    	Logger log =  Logger.getLogger("CreditCard");
        CreditCardLogic obj = new CreditCardLogic("saran",1234567890,1225);
        CreditCardLogic obj2 = obj.credit();
        
        Scanner sc = new Scanner(System.in);
        log.info("Enter The Card Number:");
        Integer newnum =sc.nextInt();
        sc.close();
        
        if((obj2.testEqual())==true) {
        	log.info("Values are same");
        }
        else {
        	log.info("Values are not same");
        }
        
    }
}
