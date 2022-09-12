package framework;

public abstract class ShopFactory {

	public abstract PrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);
	
public abstract NormalAcc getNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
	
}
