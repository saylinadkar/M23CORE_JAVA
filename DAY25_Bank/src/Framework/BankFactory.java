package Framework;

public abstract class BankFactory 
{
	public abstract SavingAcc getNewSavingAcc(int accno, String accname, float accbal,boolean isSalaried);
	
	public abstract CurrentAcc getCurrentAcc(int accno, String accname, float accbal,float creditLimit);
		
}
