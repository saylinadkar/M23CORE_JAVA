package Application;

import Framework.BankFactory;
import Framework.CurrentAcc;
import Framework.SavingAcc;

public class MMBankFactory extends BankFactory {

	@Override
	public SavingAcc getNewSavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
		MMSavingAcc s=new MMSavingAcc( accno,accname, accbal, isSalaried);
		return s;
	}

	@Override
	public CurrentAcc getCurrentAcc(int accno, String accname, float accbal, float creditLimit) {
		MMCurrentAcc c=new MMCurrentAcc( accno,accname, accbal, creditLimit);
		return c;
	}

}
