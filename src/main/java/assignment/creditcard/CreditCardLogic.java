package assignment.creditcard;

<<<<<<< HEAD
import java.util.logging.Logger;

public class CreditCardLogic implements Cloneable{
=======
public class CreditCardLogic implements cloneable{
>>>>>>> a29726decefafc3fb5542d38ef3f2ca001e26ba8
	String name;
	Integer cardno;
	Integer expdate;
	Logger log =  Logger.getLogger("CreditCard");
	
	CreditCardLogic(String name,Integer cardno,Integer expdate){
		this.name=name;
		this.cardno=cardno;
		this.expdate=expdate;
	}
	
	boolean checkNum(Integer newno) {
		return newno.equals(cardno);
	}
	
	CreditCardLogic credit() {
		try {
			return (CreditCardLogic) super.clone();
			
		}catch(CloneNotSupportedException e){
			log.info("Cloning err");
			return this;
		}
	}

}
