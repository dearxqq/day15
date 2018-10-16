package com.hc.tostring;

public class TestTostring {

	public static void main(String[] args) {
		Pig p2  = new Pig("孙子", 1);
		Pig p  = new Pig();
		Pig son = new Pig("son", 8);
		p.son = son;
		son.son = p2;
		System.out.println(p);

		// System.out.println(p + " " + new Pig("tom", 88));
		// 
	}
}

class Pig {
	private String name;
	private int weight;
	public Pig son;
	
	public Pig () {
		this("noname", 100);
	}

	public Pig(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		//  字符串 操作的时候， 对象 会调用   son.toString();
		// String str = "Pig [" + name + ", " + weight +", " + son + "]";
		String str = "Pig [" + name + ", " + weight +", " + 
		// son.toString() 
			(son == null? "null" : son.toString())
		+ "]";
		return str;
	}
}
