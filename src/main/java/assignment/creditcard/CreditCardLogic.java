package assignment.creditcard;

public class CreditCardLogic implements cloneable{
	String name;
	Integer cardno;
	Integer expdate;
	
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
			System.out.println("Cloning err");
			return this;
		}
	}

}
