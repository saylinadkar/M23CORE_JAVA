package Framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
   @SuppressWarnings("unused")
private static final float MINBAL=500;
   

	
public SavingAcc(int accno, String accname, float accbal, boolean isSalaried) {
	super(accno, accname, accbal);
	this.isSalaried = isSalaried;
}

public void withraw(float WithdrawAmu)

{
	if(Accbal<MINBAL)
	{
		System.out.println("Account Balance Minimum Limit "+MINBAL);
	}
	if(WithdrawAmu>Accbal)
	{
		System.out.println("Don't have Sufficient Account Balance."+"your Account balance is "+Accbal);
	}
	else
	{
		System.out.println("Account no"+this.getAccno()+" Account name "+this.getAccname()+" Account Balance "+(Accbal-WithdrawAmu));
}}
@Override
public String toString() {
	return String.format("SavingAcc [isSalaried=%s]", isSalaried);
}
	
	
}
