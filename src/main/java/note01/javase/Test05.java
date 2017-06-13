package note01.javase;


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
		
		int a = 3; int b = 5;
		System.out.println("a"+"="+a+"b"+"="+b);
		Test05.change(a, b);
		System.out.println("a"+"="+a+"b"+"="+b);
	}
	
	public static void  change(int a ,int b){
		System.out.println("a"+"="+a+"b"+"="+b);
		 a = 8;
		 b = 9;
		 System.out.println("a"+"="+a+"b"+"="+b);
	}
}
