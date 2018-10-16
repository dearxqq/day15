package com.hc.homework;

public class TestHome {
	/*
	 * (1)定义数字字符串数组{"010","3223","666","7890987","123123"}
	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出
	(3)如：010 是对称的，3223 是对称的，123123 不是对称的
	(4)最终打印该数组中对称字符串的个数
	 */
	public static void main(String[] args) {
		String[] arr = {"010","3223","666","7890987","123123"};
		TestHome test = new TestHome();
		System.out.println(test.judgeGroup(arr));
		
		final String s1 = "ab";
		String s2 = "abc";
		String s3 = s1 + "c";
		System.out.println(s3 == s2);
		System.out.println(s3.equals(s2)); 		//true
	}
	
	public int judgeGroup(String[] arr) {
		int count = 0;
		for(String str : arr) {
			if (judge(str) == true) {
				count++;
			}
		}
		return count;
	}

	public boolean judge(String str) {
		StringBuffer sb = new StringBuffer(str);
		String str2 = sb.reverse().toString();
		return str2.equals(str);
		/*
		char[] chars = str.toCharArray();
		for(int i = 0; i < chars.length/2; i++) {
			if(chars[i] != chars[chars.length - 1 - i]) {
				return false;
			}
		}
		return true;
		*/
	}
	
	public void doit() {
		
		String str = "java aaa java  dksajfasf";
		String str3 = str.replaceAll("java", "");
		int i = (str.length() - str3.length())/"java".length();
	}
}
