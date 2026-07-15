package com.training;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class CollectionDemo2 {

	public static void main(String[] args) {
		List<Integer> ids = new Vector<Integer>();
		
		ids.add(12);
		ids.add(22);
		//ids.add("Neha");
		ids.add(22);
		ids.add(5);
		
		Collections.sort(ids);
		
		ids.remove(new Integer(22));
		
		System.out.println(ids);
		
		//
		Iterator<Integer> iterator = ids.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		for(Integer i:ids) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
