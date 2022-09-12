package framework;

public abstract class ShopAcc {
private int AccNo;
private String AccName;
private Float Charges;
//constructor
public ShopAcc(int accNo, String accName, Float charges) {
	super();
	AccNo = accNo;
	AccName = accName;
	Charges = charges;
}
public int getAccNo() {
	return AccNo;
}
public void setAccNo(int accNo) {
	AccNo = accNo;
}
public String getAccName() {
	return AccName;
}
public void setAccName(String accName) {
	AccName = accName;
}
public Float getCharges() {
	return Charges;
}
public void setCharges(Float charges) {
	Charges = charges;
}
@Override
public String toString() {
	return String.format("ShopAcc [AccNo=%s, AccName=%s, Charges=%s]", AccNo, AccName, Charges);
}
abstract public void bookProduct(float charges);
public void items(float charges)

{
	System.out.println(charges);
	
}


}
