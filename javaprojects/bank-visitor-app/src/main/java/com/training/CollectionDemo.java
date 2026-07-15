package com.training;

import java.util.HashSet;
import java.util.Set;

public class CollectionDemo {

	public static void main(String[] args) {
		Set ids = new HashSet();
		
		ids.add(88);
		ids.add(12);
		ids.add(15);
		ids.add(19);
		
		ids.remove(12);
		ids.isEmpty();
		System.out.println(ids);
		
	}
}
