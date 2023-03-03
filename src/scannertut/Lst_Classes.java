package scannertut;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Lst_Classes {

	public static void main(String[] args) {
		//ArrayList<Integer> arrayList = new ArrayList<Integer>();
	List<Integer> li=new ArrayList<Integer>();
	li.add(5);
	li.add(10);
	li.add(15);
	li.add(20);
	li.add(25);
System.out.println("Arraylist:"+li);
int size = li.size();
System.out.println(size);
Integer s = li.set(2, 16);
Integer set2 = li.set(3, 21);
System.out.println(li);
	
	List<Object> li1=new LinkedList<Object>();
	li1.add("This");
	li1.add("is");
	li1.add(1.8);
	li1.add("Java");
	li1.add("Standard");
	li1.add("version");
	System.out.println("Linkedlist:"+li1);
boolean contains = li1.contains(1.8);
System.out.println(contains);
Object obj = li1.get(4);
System.out.println(obj);
Object set = li1.set(3,"JAVA");
System.out.println("Set:"+li1);
     List<Integer> li2=new Vector<Integer>();
     li2.add(1);
     li2.add(2);
     li2.add(3);
     li2.add(4);
    System.out.println("Vectorlist:"+li2);
     
    li2.addAll(li);
    System.out.println(li2);
    li2.retainAll(li);
    System.out.println(li2) ;
	li2.removeAll(li2);
	System.out.println(li2);

}
}