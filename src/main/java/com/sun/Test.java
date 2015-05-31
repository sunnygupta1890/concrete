package com.sun;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>(10);
		l.add(0, 1);
		System.out.println(l.size());
		l.add(6, 7);
		
	}
}
