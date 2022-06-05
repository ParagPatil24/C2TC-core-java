package myStore;

public class findingChar{
	public static void main(String[] args) {
		System.out.println("Strings");
		
		String Ab="patil";
		
		 //finding Character**

        System.out.println(Ab.substring(1,5));
        System.out.println(Ab.replace('t','j'));
        System.out.println(Ab.replace("l","k"));
        System.out.println(Ab.startsWith("k"));

        System.out.println(Ab.endsWith("L"));
        System.out.println(Ab.endsWith("l"));
        String Nwe= "Parag Patilili";

        System.out.println(Nwe.indexOf("ili"));
        System.out.println(Ab.equals("patil"));

        //Escape Sequence**

        System.out.println("Iam Patil Parag \\");
        System.out.println("I am patil parag \nwith 80 marks\b");

        System.out.println("Iam Parag \fjhu Patil");
        System.out.println("Iam Parag \rjhu Pat\til");
	}
}