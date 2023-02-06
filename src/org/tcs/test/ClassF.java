package org.tcs.test;

public class ClassF extends ClassD{
	
	public void childTwo() {
		System.out.println("This is child two");
	}
	
	public static void main(String[] args) {
		
		ClassF cf = new ClassF();
		cf.childTwo();
		cf.information();
	}

}
