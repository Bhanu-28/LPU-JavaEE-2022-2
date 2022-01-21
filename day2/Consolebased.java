package day2;
import java.util.Scanner;
public class Consolebased {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to Customer Management System");
		
		// Create the Scanner object and pass input stream in it
		Scanner scanner = new Scanner(System.in); // Read data from console and let scanner process it
		
		System.out.println("Enter Your Name: ");
		String name = scanner.nextLine(); // this is to read String
		
		System.out.println("Enter your Email: ");
		String email = scanner.nextLine();
		
		System.out.println("Enter Your Age: ");
		int age = scanner.nextInt(); // to read int
		
		/*scanner.close(); //to release memory resources
		System.out.println("hello "+ name+ " You are "+ age+" years old");*/
		

		
		
		scanner.close();
		// to release the memory resources
		
		System.out.println("Hello "+name+" You are "+age+" years old");
		 
		System.out.println("We will send you an email at "+email);
		
	}

}
