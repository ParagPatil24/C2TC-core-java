package com.tns.framwork;
//import com.application.goshopping.*;

public abstract class NormalAcc extends Shop_Acc {

	//Field
	private final static float deliveryCharges = 75.0f;

	// Constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges );
	}

	

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}
	//public static int Noofacc{}
	//methods
	@Override
	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString()  + deliveryCharges ;
	}
}
//" NormalAcc{" + "deliveryCharges=" + deliveryCharges + '}';
