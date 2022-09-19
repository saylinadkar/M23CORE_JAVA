package Client;

import Application.MMBankFactory;
import Application.MMCurrentAcc;
import Application.MMSavingAcc;
import Framework.BankFactory;
import Framework.CurrentAcc;
import Framework.SavingAcc;


public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
	BankFactory f=new MMBankFactory();
		SavingAcc s=new MMSavingAcc(123,"Sayli Nadkar",1000,true);
        CurrentAcc c=new MMCurrentAcc(123,"Sayli Nadkar",1000,500);
        System.out.println("Saving Acount");
         s.withraw(2000);
        System.out.println("Current Account");
         c.withdraw(400);
        
	}

}
