package scannertut;

import java.util.Scanner;

public class ScannerTuto {

	public static void main(String[] args) {
		Scanner fetch=new Scanner(System.in);
		
		System.out.println("what's your first name:");
		String name=fetch.next();
		
		System.out.println("what's your Father's name:");
		String nam=fetch.next();
		
		System.out.println("what's your qualification:");
		String qual=fetch.next();
		
		System.out.println("what's your age:");
		int age=fetch.nextInt();
		
		System.out.println("what's your skill:");
		String skill=fetch.next();
		skill +=fetch.nextLine();
		
		System.out.println("what's your Mobile no:");
		long no=fetch.nextLong();
		System.out.println("Thank you "+ name + ",you are " + age +"years old");
	System.out.println("and your skill is "+ skill);
	}

}
