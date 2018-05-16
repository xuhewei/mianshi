package note01;


/*
一个.java源文件中可以定义多个class
并且一个class会生成一个.class文件。

一个.java源文件中可以没有public的class

public的class必须的名字必须和文件名保持一致。

如果要定义public的class，那么这个public的class也只能有一个。
*/

public class A{
	public static void main(String[] args){
		System.out.println("A's main method execute!");	
	}
}

class B{
	public static void main(String[] args){
		System.out.println("B's main method execute!");	
	}
}

class C{
	public static void main(String[] args){
		System.out.println("C's main method execute!");	
	}
}

class D{
	public static void main(String[] args){
		System.out.println("D's main method execute!");	
	}
}
//这里会有好多的问题

