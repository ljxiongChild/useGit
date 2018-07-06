package com.jing;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("hello");
		int total = AddNumber.add(2, 3);
		System.out.println(total);
		
		System.out.println("---------------");
		Jian jian1 = new Jian();
		int jian2 = jian1.jian(9, 7);
		System.out.println(jian2);
		System.out.println("---------------");
		System.out.println(Cheng.cheng(2, 3));
	}

}
