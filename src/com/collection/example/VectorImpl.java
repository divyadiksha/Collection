package com.collection.example;

import java.util.Vector;

public class VectorImpl {

	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		for(int i=1;i<=20;i++) {
			vector.add(i);
		}
		
		System.out.println("Initial capacity:"+vector.size());
		
		vector.add(11);
		System.out.println("When capacity threshold exceeds, new size:"+vector.size());
		
		Vector<Integer> v1 = new Vector<>(5,2);
		
		for(int i=1;i<=5;i++) {
			v1.add(i);
		}
		
		v1.add(6);
		v1.add(7);
	}
}
