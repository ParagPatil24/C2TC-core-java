package com.application.goshopping;
import com.tns.framwork.*;
public class GSNormalAcc extends NormalAcc {

	
		//constructor
		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
			super(accNo, accNm, charges, deliveryCharges);
		}
		
		//methods
		public void bookProduct( float Charges) {
//			
			System.out.println("**Normal user Charges are: " + getCharges() + "     with Delivery charge: "+ getDeliveryCharges());
			//System.out.println();
		}

		@Override
		public String toString() {
			return super.toString();
		
  }

}
