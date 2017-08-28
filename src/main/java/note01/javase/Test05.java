package note01.javase;

import note01.javase.entity.User;

public class Test05 {
	/*
	1、java中的参数传递
		当 传递基本数据类型的数据的时候，形参的改变 对 实参 是没有影响的
		传递引用数据类型的数据
	
	2、java中的参数传递
		当 传递基本数据类型的数据的时候，形参的改变 对 实参 是没有影响的
		
		当 传递引用数据类型的数据的时候，形参的改变 对 实参 是有影响的
*/
	public static void main(String[] args){
		
		/*int a = 3; int b = 5;
		System.out.println("a"+"="+a+"b"+"="+b);//35
		Test05.change(a, b);                    //35  89  35
		System.out.println("a"+"="+a+"b"+"="+b);*/
		
		String name = "xuhewei";
		Test05.change(name);
		System.out.println(name);
		System.out.println("================================================================");
		User user = new User();
		user.setName("aaa");
		System.out.println(user.getName());
		Test05.change(user);
		System.out.println(user.getName());
	}
	
	public static void  change(int a ,int b){
		System.out.println("a"+"="+a+"b"+"="+b);
		 a = 8;
		 b = 9;
		 System.out.println("a"+"="+a+"b"+"="+b);
	}
	public static void change(String name){
		System.out.println(name);
		 name = new String("aaa");
		 System.out.println(name);
	}
	public static void change(User user){
		user.setName("bb");
		System.out.println(user.getName());
	}
}
