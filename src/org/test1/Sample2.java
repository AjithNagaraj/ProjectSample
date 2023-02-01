package org.test1;

import org.test.Sample;

public class Sample2 extends Sample {
	public Sample2() {
		this("All the best");
		System.out.println("Default child");
	}
	public Sample2(int id) {
//		super();
		System.out.println("Id is :"+id);
	}
	public Sample2(String quote) {
		this(45);
		System.out.println("Quote is :"+quote);
	}
	public static void main(String[] args) {
		Sample2  s2 = new Sample2();
	}

}
