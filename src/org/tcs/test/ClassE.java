package org.tcs.test;

public class ClassE extends ClassD {
	
	public void childOne() {
		System.out.println("This is Child One");
	}

	public static void main(String[] args) {
		
		ClassE ce = new ClassE();
		ce.childOne();
		ce.information();
	}
}
