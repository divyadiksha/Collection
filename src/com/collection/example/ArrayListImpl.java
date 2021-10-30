package com.collection.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Example to demonstrate array list.
 * Array List uses dynamic array internally.
 * It maintains insertion order.
 * It provides random access.
 * It is not synchronized.
 * Debug to see the internal processing. 
 * 
 * @author Divya Diksha
 *
 */
public class ArrayListImpl {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		
		//insert
		for(int i=1;i<=10;i++) {
			arrayList.add(i);
		}
		//get
		System.out.println("5th element:"+arrayList.get(4));
		
		//removes element at index 4
		arrayList.remove(4);
		System.out.println("5th element:"+arrayList.get(4));
		
		//returns size of the array list
		System.out.println("Size of the arrayList:"+arrayList.size());
		
		//checks if the element is present
		System.out.println("Is 10 present in the arrayList: "+arrayList.contains(10));
		System.out.println(arrayList);
		
		arrayList.add(11);
		arrayList.add(11);
		System.out.println("Allows duplicate elements:"+arrayList);
		
		arrayList.add(null);
		System.out.println("Allows null entry:"+arrayList);
		System.out.println("Is null present in the arrayList: "+arrayList.contains(null));
		
		//stream arrayList
		System.out.println("Number of even elements:"+arrayList.stream().filter(e->e!=null && e%2==0).count());
	}
}
