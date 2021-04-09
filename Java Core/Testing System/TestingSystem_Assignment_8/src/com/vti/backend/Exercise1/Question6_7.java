package com.vti.backend.Exercise1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Question6_7 {
	Map<Integer, String> students = new HashMap<Integer, String>();

	public void add() {
		students.put(1, "AAA");
		students.put(4, "bbb");
		students.put(3, "ccc");
		students.put(2, "ddd");

	}

	public void printKey() {
		for (Integer a : students.keySet()) {
			System.out.println(a);
		}
	}

	public void printValues() {
		for (String string : students.values()) {
			System.out.println(string);
		}
	}

	public void printvaluesSort() {
		
		for (Entry<Integer, String> entry  : entriesSortedByValues(students)) {
			System.out.println(entry.getValue());
		}
	}
	static <K,V extends Comparable<? super V>>
	SortedSet<Map.Entry<K,V>> entriesSortedByValues(Map<K,V> map) {
	    SortedSet<Map.Entry<K,V>> sortedEntries = new TreeSet<Map.Entry<K,V>>(
	        new Comparator<Map.Entry<K,V>>() {
	            @Override public int compare(Map.Entry<K,V> e1, Map.Entry<K,V> e2) {
	                int res = e1.getValue().compareTo(e2.getValue());
	                return res != 0 ? res : 1;
	            }
	        }
	    );
	    sortedEntries.addAll(map.entrySet());
	    return sortedEntries;
	}
}
