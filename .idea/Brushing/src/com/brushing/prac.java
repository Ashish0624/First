package com.brushing;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class prac {

	public static void main(String[] args) {

		Vector v = new Vector();

		// Iterating over vector object
		for (int i = 0; i < 10; i++)
			v.addElement("hello " + i);

		// Printing elements in vector object
//		System.out.println(v);

		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			arr.add("data at " + i);
		}
		// At beginning e(cursor) will point to
		// index just before the first element in v
		Enumeration e = v.elements();
		Iterator<String> itr = arr.iterator();

		// Checking the next element availability where
		// condition holds true till threre is a single element
		// remaining in the List
		while (e.hasMoreElements()) {
			// Moving cursor to next element
			String i = (String) e.nextElement();

			// Print above elements in object
			System.out.print(i + " ");
		}
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.println(str);
		}

		while (itr.hasNext()) {
			if (arr.contains("data at 2")) {
				itr.remove();
			}
//			System.out.println(arr);
		}

		while (itr.hasNext()) {
			System.out.println(arr);
		}
		
		
		
	}
}
