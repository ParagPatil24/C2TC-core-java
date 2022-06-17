package myStore;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City Station = new City();
		Station.mumbai("Thana");
		District name=new District();
		name.mumbai("U");
		name.mumbai();

	}

}
class City{
	String s="mumbai";
	public void pune() {
		System.out .println("I love pune");
	}
	public void mumbai(float a){
		System.out .println("I love Dadar");
		
	}
	public void mumbai(String v) {
		System.out .println("I love "+v);
	}
}
class District extends City{
	void mumbai() {
		System.out .println("I love "+s);
	}
}