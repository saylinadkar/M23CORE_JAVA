package Application;

import framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("GSNormalAcc [toString()=%s]", super.toString());
	}

	
}