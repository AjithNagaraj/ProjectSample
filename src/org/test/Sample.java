package org.test;

public class Sample {
	
	public Sample() {
		this(1400917);
		System.out.println("Default constructor");
	}
	public Sample(int id) {
		System.out.println("EMp ID "+ id);
	}
	public Sample(long phone) {
		this("Ajith");
		System.out.println("Emp phone "+phone);
	}
	public Sample(String name) {
		this(1400917);
		System.out.println("EMP name "+name);
	}
	

}


