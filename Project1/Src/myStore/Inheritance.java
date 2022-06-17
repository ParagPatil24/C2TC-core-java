package myStore;

class  Animal {

	 String name;
	  public void eat() {
	    System.out.println("\nI can eat");
	   
	  }
	}

	
	 class  Dog extends Animal {

	  // new method in subclass
	  public void display() {
	    System.out.println("My name is " + name);
	   
	  }
	  String o;
	  public void jon (int Age) {
		
		  System.out.printf("My age is %d ", Age);
		
	  }
	}
	 

	public class Inheritance {
	  public static void main (String args[]) {

	    Dog labrador = new Dog();

	    
	    labrador.name = "Rohu";
	    labrador.display();
	    labrador.jon(5);
	    // calling method of superclass
	    // using object of subclass
	    labrador.eat();

	  }
	}