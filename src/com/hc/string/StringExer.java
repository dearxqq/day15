package com.hc.string;

public class StringExer {
	
	private int upperNum = 0;
	private int lowerNum = 0;
	private int digitalNum = 0;
	// 重写  toString 方法 。
	
	@Override
	public String toString() {
		return  upperNum + " " + lowerNum + " " + digitalNum;
	}
	

	public static void main(String[] args) {
		String str = 
		"asdkfajkdfajfdkDSAF432423525432dsafjkasFFFF;;;;dsf;";
		StringExer  test = new StringExer();
		test.countAll(str);
		// char ch = 'a';
		// if ( ch >= 'a' && ch <= 'z')
		System.out.println(test);
		String str2 = "I lov java and java and java and ? and money bbbb j";
		System.out.println(test.CountString(str2, "java"));
	}
	
	/*
	 * 编写一个方法，输出在一个字符串中，指定字符串出现的次数
	 */
	public int CountString(String str, String target) {
		int fromIndex = 0;
		int index = 0;
		int count = 0;
		
		/*
		while((index=str.indexOf(target, fromIndex)) != -1) {
			count ++;
			fromIndex = index + target.length();
		}
		*/
		//  do { } while();
		index = str.indexOf(target);
		System.out.println("index = " + index + " fromIndex=" + fromIndex);
		while (index != -1)  {
			count ++;
			fromIndex = index + target.length();
			index = str.indexOf(target, fromIndex);
			System.out.println("index = " + index + " fromIndex=" + fromIndex);
		}
		return count;
	}
	
	// str = "aBccfF"  ,  Abccff
	public String firstUpper(String str) {
		return null;
	}
	
	public void countAll(String st) {
		// 1. 将  str 转变成  char[] 数组
		char[] arr = st.toCharArray();
		// 2. 通过  for 循环 语句 加  if 进行判断
		for(char ch : arr) {
			if (ch >= 'a' && ch <= 'z') {
				lowerNum ++;
			}
			if (ch >= 'A' && ch <= 'Z') {
				upperNum ++;
			}
			if (ch >= '0' && ch <= '9') {
				digitalNum ++;
			}
		}
	}
	

}
