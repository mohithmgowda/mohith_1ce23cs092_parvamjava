package com.lists;
import java.util.ArrayList;
import java.util.List;



public class listinterface {
	
		public static void main(String[] args) {
			List list = new ArrayList();
			list.add(12);
			list.add(12.0);
			list.add("HELLO");
			list.add(true);
			list.add(12);
			list.add(12);
			System.out.println(list);
			
			
			
			Object object = list.get(0);
			Integer firstvalue = (Integer)object;
			System.out.println(firstvalue);
			
			String name=(String)list.get(2);
			System.out.println(name);
			
			System.out.println("****...........**********");
			List<Integer> integers = new ArrayList<>();
			integers.add(120);
			integers.add(130);
			System.out.println(integers);
			
			Integer integer = integers.get(1);
			System.out.println(integer);
		}

	
}