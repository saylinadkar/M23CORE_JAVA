package Client;

import Application.GSNormalAcc;
import Application.GSPrimeAcc;
import Application.GSShopFactory;
import framework.NormalAcc;
import framework.PrimeAcc;
import framework.ShopFactory;

public class Client {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ShopFactory s=new GSShopFactory();
		PrimeAcc p=new GSPrimeAcc(1001,"Sayli Nadkar",500, true);
		NormalAcc n=new GSNormalAcc(1002,"Parth Nadkar",500, 50);
		System.out.println("Prime Account: ");
		p.bookProduct(200);
		
		System.out.println("Normal Account: ");
		n.bookProduct(200);
		
		
		//System.out.println(p);
		//System.out.println(n);



		

	}

}