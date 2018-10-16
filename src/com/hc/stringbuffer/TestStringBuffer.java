package com.hc.stringbuffer;

public class TestStringBuffer {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("123");
		System.out.println(s);
		method(s);
		System.out.println(s);
		test();
		String str = "abc";
	}
	
	public static void method(StringBuffer str) {
		// str = str + "abc";
		str.append("abc");
	}

	// 如果 是  String， 会创建  1000 个对象 。使用  StringBuffer , 就是一个 对象 。
	public static void test() {
		// StringBuffer str = new StringBuffer("abcd");
		StringBuffer str = new StringBuffer(20);
		for(int i=0; i< 1000; i++) {
			// String str = "abcd " + i;
			str.append(i);
			System.out.println(str);
			str.delete(4, str.length());
		}
	}
}
