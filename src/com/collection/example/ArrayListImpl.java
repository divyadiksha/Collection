package com.collection.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Example to demonstrate array list.
 * Array List uses dynamic array internally.
 * It maintains insertion order.
 * It provides random access.
 * It is not synchronized 
 * 
 * @author Divya Diksha
 *
 */
public class ArrayListImpl {

	public static void main(String[] args) {
		
		List<Integer> arrayList = new ArrayList<>();
		
		for(int i=1;i<=10;i++) {
			arrayList.add(i);
		}
		
		System.out.println("5th element:"+arrayList.get(4));
	}
}
