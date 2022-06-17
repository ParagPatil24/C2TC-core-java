package myStore;



import java.util.Scanner;

public class Hotelwelcome {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println( "new code");
        System.out.println("What is your name Sir");
         String patil = inp.nextLine();
       int j= 104;
        String m="yes";
        System.out.printf("welcome %s Sir, ",patil);
        System.out.println("");
        System.out.println("would you like to have room sir?");

        String oo= inp.nextLine();
        
        if (oo.equals(m))
        {
            System.out.printf("Your room No. is %d ",j);
            System.out.println("");

            System.out.println("Thank_You for visiting :)");

        }
        else;
        System.out.println("Thank_You for visiting :)");

   }
}


