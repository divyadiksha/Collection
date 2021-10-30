package com.collection.example;

import java.util.LinkedList;

public class LinkedListImpl {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=1;i<=10;i++) {
			ll.add(i);
		}
		System.out.println(ll);
		System.out.println(ll.get(5));
	}
}
