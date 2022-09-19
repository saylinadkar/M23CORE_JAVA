package Application;

import Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {

	public MMSavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
		super(accno, accname, accbal, isSalaried);
		
	}

	@Override
	public String toString() {
		return String.format("MMSavingAcc []");
	}

	
}
