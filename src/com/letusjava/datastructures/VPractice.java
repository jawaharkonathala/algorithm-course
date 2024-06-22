package com.letusjava.datastructures;

import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;
import java.util.Vector;

public class VPractice {

	public static void main(String[] args) {
		
		Vector v1 = new Vector(); // Without generics
		Vector v2 = new Vector(8);
		
		Object[] arr = new Object[] {1, 2, 4, 5, 8};
		Vector v3 = new Vector(Arrays.asList(arr));
		
		
		v1.add("Rohit");
		v1.add("Gana");
		v1.add("Rajesh");
		v1.add("Mehtab");
		
		System.out.println(Arrays.toString(arr));
		System.out.println(v1.size());
		System.out.println(v1.capacity()+" "+v2.capacity()+" "+v3.size());
		System.out.println(v3);
		
		v2.add("Suresh");
		v2.add("Ram");
		
		v1.addAll(v2);
		v1.add("Gana");
		v1.add("Suresh");
		
		v1.addAll(Arrays.asList(new String[]{"Mehak", "Vaibhav"}));
		
		v1.add("Subrhmanyam");
		
		System.out.println("Elements of v1 are: " + v1);
		
		System.out.println(v1);
		
		System.out.println(v3.get(2) instanceof Object);
		
		// Retrieve the object from the vector
		System.out.println(v1.get(3));
		
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		v2.add(0, "Lehmann");
		v2.add(2, "Xman");
		System.out.println(v2);
		
		v1.remove("Gana");
		v1.removeAll(Arrays.asList(new String[] {"Ram", "Rajesh"}));
		
		System.out.println(v1);
		
		// Clear entire vector
		
		// v1.clear();
		
		System.out.println("Size of v1: "+v1.size()+", capacity of v1: "+v1.capacity());
		
		// Check elements are present
		
		System.out.println(v1.contains("Mehak"));
		
		

	}

}
