package com.tns.framwork;

public abstract class Prime_AccFrame extends Shop_Acc {

	public Prime_AccFrame(int accNo, String accNm, float charges,boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
		// TODO Auto-generated constructor stub
	}

	//field
	private boolean isPrime = true;
	private static final float deliveryCharges = 100.0f;

	//Constructor
//	public Prime_Accframe(int accNo, String accNm, float charges, boolean isPrime) {
	//	super(accNo, accNm, charges);
	//	this.isPrime = isPrime;
	//}

	public boolean getisPrime() {
		return this.isPrime;
	}

	public float getDeliverycharges() {
		return deliveryCharges;
	}

	//methods
	@Override
	public void bookProduct(float book) {

	}

	@Override
	public String toString() {
		return super.toString();
	}

}