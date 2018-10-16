package com.hc.string;

public class TestContruct {

	public static void main(String[] args) {
		String str = new String();
		String str2 = new String("");
		String str3 = null;
		
		String str4 = new String("abc");
		// byte  ( 99, 100, 101, 102
		// char  'j'  , 'a', 'v"
		byte[] arr = { 100, 101, 102 };
		char[] arr2 = {'a' , 'f' , 'd' };
		String str5 = new String(arr);
		String str6 = new String(arr2);
		System.out.println(str5);
		System.out.println(str6);
		System.out.println(str6.length());
		System.out.println(arr2.length);
		String str7 ="You I love java and shit";
		// substring(beginIndex, endIndex)   endIndex 的值不包含 。
		System.out.println(str7.substring(0, 3));
		System.out.println(str7.substring(str7.length()-4));


		System.out.println(str.equals(str2));

	}

}
