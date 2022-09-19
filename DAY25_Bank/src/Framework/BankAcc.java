package Framework;

public abstract class BankAcc {
	private int Accno;
	private String Accname;
    protected float Accbal;
	public BankAcc(int accno, String accname, float accbal) {
		super();
		Accno = accno;
		Accname = accname;
		Accbal = accbal;
	}
	
	public int getAccno() {
		return Accno;
	}
	public void setAccno(int accno) {
		Accno = accno;
	}
	public String getAccname() {
		return Accname;
	}
	public void setAccname(String accname) {
		Accname = accname;
	}
	public float getAccbal() {
		return Accbal;
	}
	public void setAccbal(float accbal) {
		Accbal = accbal;
	}
     
	public  void withraw(float Accbal)
	{
		
	}
	public void deposite(float Accbal) 
	{
	
	}	
	@Override
	public String toString() {
		return String.format("BankAcc [Accno=%s, Accname=%s, Accbal=%s]", Accno, Accname, Accbal);
	}
	



}
