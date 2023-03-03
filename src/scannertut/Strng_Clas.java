package scannertut;

public class Strng_Clas {
	public static void main(String[] args) {
		String s="I AM SARANYA SAMRAJ.";
		String s1="I am in Java Class.";
		
	int length = s.length();
	System.out.println("s.length:"+length);	
	int length2 = s1.length();
	System.out.println("s1.length:"+length2);
	
	boolean equals = s.equals(s1);
	System.out.println(equals);
	boolean equals2 = s.equals("I AM SARANYA SAMRAJ.");
	System.out.println(equals2);
	boolean equalsIgnoreCase = s.equalsIgnoreCase("i am saranya samraj.");
	System.out.println(equalsIgnoreCase);
	boolean equalsIgnoreCase2 = s1.equalsIgnoreCase("i am in JAVACLASS");
	System.out.println(equalsIgnoreCase2);
	
	char charAt = s.charAt(3);
	System.out.println("s.charAt3:"+charAt);
	char charAt2 = s1.charAt(8);
	System.out.println("s1.charAt8:"+charAt2);
	String concat = s.concat(s1);
	System.out.println("concat:"+concat);
	
	int indexOf = s.indexOf("M");
	System.out.println("s.indexOf M:"+indexOf);
	int lastIndexOf = s1.lastIndexOf("s");
	System.out.println("s1.lastIndexOf s:"+lastIndexOf);
	
	String upperCase = s1.toUpperCase();
	System.out.println(upperCase);
    String lowerCase = s.toLowerCase();
    System.out.println(lowerCase);
    boolean startsWith = s.startsWith("I");
    System.out.println(startsWith);
    boolean endsWith = s1.endsWith("ss.");
System.out.println(endsWith);
}
	
	
}
