package note01;
/**
 * 单例模式的实现通常有两种方式：“饿汉式”和“懒汉式”。
 * @author gut
 */
public class Singleton {
	
	/*
	 * 饿汉式
	 */
	private static final Singleton singleton = new Singleton();
	private Singleton(){}//私有化构造方法
	public Singleton getInstance(){
		return singleton;
	}
}
/**
 * 懒汉式
 */
class Singleton1{
	private static  Singleton1 singleton1;
	private Singleton1 getInstance1(){
		if(singleton1==null){
			singleton1 = new Singleton1();
		}
		return singleton1;
	}
}