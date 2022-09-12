package Application;

import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class GSShopFactory extends ShopFactory
{

	

	@Override
	public PrimeAcc getNewPrimeAcc(int accNo, String accName, float charges, boolean isprime) {
		GSPrimeAcc p=new GSPrimeAcc(accNo,accName,charges,isprime);
		return p;
	}

	@Override
	public NormalAcc getNormalAcc(int accNo, String accName, float charges, float deliveryCharges ) {
		GSNormalAcc n=new GSNormalAcc(accNo,accName,charges,deliveryCharges);
		return n;
	}

	

}