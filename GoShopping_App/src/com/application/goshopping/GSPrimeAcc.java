package com.application.goshopping;
import com.tns.framwork.*;
public class GSPrimeAcc extends Prime_AccFrame {
	
	//Field
	private static final float charges = 300.0f;

	//constructor
//	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
	//	super(accNo, accNm, charges, isPrime);
	//}

	public GSPrimeAcc(int accNo, String accNm, float charges2, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	public float getCharge() {
		return GSPrimeAcc.charges;
	}


	//methods
	@Override
	public void bookProduct(float book) {

		System.out.println("**Prime user Charges are: " + getCharges()+"      with NO Delivery charges" );
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
