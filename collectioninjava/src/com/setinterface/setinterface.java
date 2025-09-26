package com.setinterface;
import java.util.HashSet;
import java.util.Set;
public class setinterface {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(12);
		set.add(12);
		set.add(50);
		set.add(100);
		set.add(100);
		System.out.println(set);
	}
}
