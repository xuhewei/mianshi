package note01;


public class TestSingleton {
	//第一种单利模式（饿汉式）
	private TestSingleton(){}
	private static TestSingleton instance = new TestSingleton();
	
	public static  TestSingleton getInstance(){
		return instance;
	}
	//第二种单利模式（懒汉式）
	private static TestSingleton instance2 = null;
	public static synchronized TestSingleton getInstance2(){
		if(instance2 == null){
			instance2 = new TestSingleton();
		}
		return instance2;
	}
}

/**
 * 
 * 编程题: 写一个Singleton出来。
　Singleton模式主要作用是保证在Java应用程序中，一个类Class只有一个实例存在。一般Singleton模式通常有几种种形式:　第一种形式: 定义一个类，它的构造函数为private的，它有一个static的private的该类变量，在类初始化时实例话，通过一个public的getInstance方法获取对它的引用,继而调用其中的方法。

public class Singleton {
private Singleton(){}
　　    //在自己内部定义自己一个实例，
是不是很奇怪？
　　    //注意这是private 只供内部调用
　　    private static Singleton in
stance = new Singleton();
　　    //这里提供了一个供外部访问本cl
ass的静态方法，可以直接访问　　
　　    public static Singleton get
Instance() {
　　　　    return instance; 　　
　　    } 
    }   


第二种形式: 

public class Singleton { 
　　private static Singleton instance = null;
　　public static synchronized Sing
leton getInstance() {
　　//这个方法比上面有所改进，不用每次
都进行生成对象，只是第一次　　　 　
　　//使用时生成实例，提高了效率！
　　if (instance==null)
　　　　instance＝new Singleton();
return instance; 　　} 
}  



 其他形式:定义一个类，它的构造函数为private的，所有方法为static的。一般认为第一种形式要更加安全些 

 */