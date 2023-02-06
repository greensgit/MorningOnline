package org.tcs.test;

public class ClassB extends ClassA {
	
	public void informationOfChild() {
		System.out.println("This is Child class");
	}
	
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.informationOfChild();
		cb.parentInfo();
		cb.courseName();
		cb.grandParentInfo();
	
	}

}
