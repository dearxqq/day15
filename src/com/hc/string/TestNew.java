package com.hc.string;

public class TestNew {

	public static void main(String[] args) {
		Animal a = new Animal();

	}

}

class Animal {
	private Animal son = num > 100 ? null  : new Animal() ;
	private String name;
	private static int num = 0;
	
	public Animal() {
		System.out.println("in new animal");
		num++;
		/*
		num ++;
		if (num == 100) {
			// null;
		} else {
			son = new Animal();
		}
		*/
	}
}
