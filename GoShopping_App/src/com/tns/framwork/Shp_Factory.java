package com.tns.framwork;

//import com.application.goshopping.GSShop_Factory;
//import shop.*;
public abstract class Shp_Factory {
	
	public abstract Prime_AccFrame getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime);

	public abstract NormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges);
}
