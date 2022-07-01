package com.application.goshopping;
import com.tns.framwork.*;
//import java.util.*;
public class GSShop_Factory extends Shp_Factory {
	//methods
	public GSPrimeAcc getNewPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		GSPrimeAcc GsPrime = new GSPrimeAcc (accNo, accNm, charges, isPrime);
		System.out.println(GsPrime.toString());
		return GsPrime;
	}

	public GSNormalAcc getNewNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		GSNormalAcc GsNormal = new GSNormalAcc(accNo, accNm, charges, deliveryCharges);
		System.out.println(GsNormal.toString());
		return GsNormal;
	}
}
