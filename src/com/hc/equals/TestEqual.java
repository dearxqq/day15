package com.hc.equals;

public class TestEqual {

	public static void main(String[] args) {
		Person p1 = new Person(new String("tiger"), 33);
		Person p2 = new Person(new String("tiger"), 33);
		p2 = null;
		boolean b1 = p1.equals(p2);
		System.out.println(b1);
		System.out.println(p1);
		System.out.println(p2);
	}

}

// svn://192.168.0.208/java3/teacher/se
class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*
	 * public boolean equals(Person obj) { return true; }
	 */

	@Override
	// equa alt + /
	// equals 方法的重写
	public boolean equals(Object obj) {
		// 如果比较对象 是 空指针， 肯定 是 返回 false
		if (obj == null) {
			return false;
		}

		// 如果 是 同一个对象 。
		if (obj == this) {
			return true;
		}

		// 判断 obj 是否 是 Peron的 对象或 子类对象
		if (obj instanceof Person) {
			Person p = (Person) obj;
			// return (name.equals(p.name) && age == p.age) ;
			if (name.equals(p.name) && age == p.age) {
				// if( name == p.name && age == p.age) {
				return true;
			}
		}
		return false;
	}
}
