package scannertut;

public class Costruct_Class {
 public Costruct_Class() {
	 System.out.println("Constructor name is same as class name");
	 System.out.println("types of constructor");
 }
 public Costruct_Class(String name) {
	
	 System.out.println("Types :"+name);
	  }
 public static void main(String[] args) {
	Costruct_Class ob=new Costruct_Class();
Costruct_Class ob1=new Costruct_Class("1.para constructor");
Costruct_Class ob2=new Costruct_Class("2.default constructor");
	}

}
