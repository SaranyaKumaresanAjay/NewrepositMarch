package scannertut;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Set_Classes {
public static void main(String[]  args) {
	Set<Object> s5=new HashSet<>();
	s5.add(7);
	s5.add(28);
	s5.add(14);
	s5.add(21);
	System.out.println("HashSet      :"+s5);
	Set<Object> s=new LinkedHashSet<Object>();
	s.add(7);
	s.add(28);
	s.add(14);
	s.add(21);
	System.out.println("LinkedHashSet:"+s);
	Set<Object> s1=new TreeSet<Object>();
	s1.add(7);
	s1.add(28);
	s1.add(14);
	s1.add(21);
	 System.out.println("TreeSet      :"+s1);
	System.out.println();
Map<Integer,Object> s2=new HashMap<Integer,Object>();
s2.put(12,-10);
s2.put(15,5);
s2.put(6,-5);
s2.put(9,10);
s2.put(3,15);
System.out.println("HashMap      :"+s2);
Map<Integer, Object> s3=new LinkedHashMap<Integer,Object>();
s3.put(12,-10);
s3.put(15,5);
s3.put(6,-5);
s3.put(9,10);
s3.put(3,15);
System.out.println("LinkedHashMap:"+s3);
Map<Integer, Object> s4=new TreeMap<Integer,Object>();
s4.put(12,-10);
s4.put(15,5);
s4.put(6,-5);
s4.put(9,10);
s4.put(3,15);
System.out.println("TreeMap      :"+s4);


	
	
	

	
}
}
