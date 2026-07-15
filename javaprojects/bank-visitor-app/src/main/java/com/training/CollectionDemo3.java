package com.training;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class CollectionDemo3 {

	public CollectionDemo3() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		List<String> ids = new ArrayList<String>();
		ids.add("Riley");
		ids.add("Violet");
		ids.add("Agnibesh");
		ids.add("Rakshit");
		ids.add("Preyansh");
		Collections.sort(ids);
		System.out.println(ids);

		Iterator<String> i = ids.iterator();

		while (i.hasNext()) {
			String temp = i.next();
			if (temp.charAt(0) == 'A') {
				i.remove();
				ids.remove(temp);
			} else {
				System.out.println(temp);
			}
		}

		System.out.println(ids);
	}

}
