package com.hc.string;

public class TestString {

	public static void main(String[] args) {
		// 0x1234
		String str = "abc";
		
		str = str.toUpperCase();
		System.out.println(str);

		System.out.println(Integer.toHexString(str.hashCode()));
		str = str + "efg";
		System.out.println(Integer.toHexString(str.hashCode()));
		
		Pig p = new Pig();
		System.out.println(Integer.toHexString(p.hashCode()));
		p.name = "ffff";
		System.out.println(Integer.toHexString(p.hashCode()));
		
		System.out.println(str);
		System.out.println(method(str));
		System.out.println(str);
	}
	
	public static String method(String str) {
		str = str + " end";
		// str = 0x55
		return str;
	}
}

class Pig {
	String name;
}
