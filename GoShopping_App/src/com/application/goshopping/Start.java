package com.application.goshopping;
import com.tns.framwork.*;
public class Start {
public static void main(String[] args) {
//	 Assign instance of GSShopFactory to ShopFactory reference
		Shp_Factory S = new GSShop_Factory();

//	 Instantiate GSPrimeAcc and refer it through reference PrimeAcc
		Prime_AccFrame primeAccObj = new GSPrimeAcc(14, "prime_account_name", 125f, true);


//	 Instantiate GSNormalAcc and refer it through reference NormalAcc
		NormalAcc normalAccObj = new GSNormalAcc(52, "normal_account_name", 500f, NormalAcc.getDeliveryCharges());
		NormalAcc normal = new GSNormalAcc(53, "normal_account", 1200f, NormalAcc.getDeliveryCharges());
//	  bookProduct() method
		primeAccObj.bookProduct(80f);
		normalAccObj.bookProduct(45f);
		normal.bookProduct(14f);
//	  toString() method
		primeAccObj.toString();
		normalAccObj.toString();
		
	}
}
