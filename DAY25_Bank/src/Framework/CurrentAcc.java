package Framework;

public abstract class CurrentAcc extends BankAcc {
	private static float creditLimit;

	//constructor
	@SuppressWarnings("static-access")
	public CurrentAcc(int accno, String accname, float accbal,float creditLimit) {
		super(accno, accname, accbal);
		this.creditLimit=creditLimit;
		
	}


	
	@Override
	public String toString() {
		return String.format("CurrentAcc [creditLimit=%s]", creditLimit);
	}
	public void withdraw(float WithdrawAmu)	
	{
	if(WithdrawAmu>=creditLimit)
		
	{
		System.out.println("Your credit limit is "+creditLimit);
	}
	else
	{

	System.out.println("Account no"+this.getAccno()+" Account name "+this.getAccname()+" Account Balance "+(Accbal-WithdrawAmu)+" With Maximum CreditLimit Rs "+creditLimit);
}

}}
