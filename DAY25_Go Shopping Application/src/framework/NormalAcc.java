package framework;

public abstract class NormalAcc extends ShopAcc
{
	private final float deliveryCharges;
	
	//constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public String toString() {
		return String.format("NormalAcc [deliveryCharges=%s]", deliveryCharges);
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Account No: "+this.getAccNo()+" "+"Account Name: "+this.getAccName()
		+" Charges is: "+(charges+deliveryCharges));
	}

}