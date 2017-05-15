package mianshi.javase;

public class Test01 {
	public static short getAdd(){
		short s1 =1;
		//s1+1运算结果是int型，需要强制转换类型
		s1=(short) (s1+1);
		return s1;
	}
	public static void main(String[] args) {
		// 题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数 都是多少
		int count = 0;
		for (int x = 1; x < 5; x++) {
			for (int y = 1; y < 5; y++) {
				for (int z = 1; z < 5; z++) {
					if (x != y && y != z && x != z) {
						count++;
						System.out.println(x * 100 + y * 10 + z);
					}
				}
			}
		}
		System.out.println("共有" + count + "个三位数");
	}
}
//2.final, finally, finalize的区别。 
	//final 用于声明属性，方法和类，分别表示属性不可变，方法不可覆盖，类不可继承。
	//finally是异常处理语句结构的一部分，表示总是执行。
	//finalize是Object类的一个方法，在垃圾收集器执行的时候会调用被回收对象的此方法，可以覆盖此方法提供垃圾收集时的其他资源回收，例如关闭文件等。
//3.overload和override的区别
	//重写和覆盖都是java多态的不同表现。重写是父类与子类之间多态的一种表现，重载是一个类中多态的表现。
	//如果在子类中定义某方法与其父类有相同的名称和参数，我们说该方法被重写 (Overriding)。子类的对象使用这个方法时，将调用子类中的定义，对它而言，父类中的定义如同被"屏蔽"了。如果在一个类中定义了多个同名的方法，它们或有不同的参数个数或有不同的参数类型，则称为方法的重载(Overloading)。Overloaded的方法是可以改变返回值的类型。
//4。JSP中动态INCLUDE与静态INCLUDE的区别？
	//动态INCLUDE用jsp:include动作实现 <jsp:include page="included.jsp" flush="true" />
	//它总是会检查所含文件中的变化，适合用于包含动态页面，并且可以带参数。静态INCLUDE用include伪码实现,
	//定不会检查所含文件的变化，适用于包含静态页面<%@ include file="included.htm" %>
//5.String s = new String("xyz");创建了几个String Object? 2
//6.列出你最常见的runtime exception
	//ClassCastException  NullPointerExcetion ClassNotFoundException ArithmeticException
	//ArrayStoreException BufferOverFlowException indexOutofBoundsException systemException
//7.List, Set, Map是否继承自Collection接口?
	//List，Set是，Map不是
//8.数组有没有length()这个方法? String有没有length()这个方法？
 	//数组没有length()这个方法，有length的属性。String有有length()这个方法。
//9.swtich是否能作用在byte上，是否能作用在long上，是否能作用在String上?
	//switch（expr1）中，expr1是一个整数表达式。因此传递给 switch 和 case 语句的参数应该是 int、 short、 char 或者 byte。
	//long,string 都不能作用于swtich。
//10.什么是java序列化，如何实现java序列化？
	//序列化就是一种用来处理对象流的机制，所谓对象流也就是将对象的内容进行流化。可以对流化后的对象进行读写操作，也可将流化后的对象传输于网络之间。序列化是为了解决在对对象流进行读写操作时所引发的问题。
	//序列化的实现：将需要被序列化的类实现Serializable接口，该接口没有需要实现的方法，implements Serializable只是为了标注该对象是可被序列化的，然后使用一个输出流(如：FileOutputStream)来构造一个 ObjectOutputStream(对象流)对象，接着，使用ObjectOutputStream对象的writeObject(Object obj)方法就可以将参数为obj的对象写出(即保存其状态)，要恢复的话则用输入流。
//11.java中实现多态的机制是什么？
	//方法的重写Overriding和重载Overloading是Java多态性的不同表现。重写Overriding是父类与子类之间多态性的一种表现，重载Overloading是一个类中多态性的一种表现
//12.servlet的生命周期
	//web容器加载servlet，生命周期开始。通过调用servlet的init()方法进行servlet的初始化。通过调用service()方法实现，根据请求的不同调用不同的do***()方法。结束服务，web容器调用servlet的destroy()方法
//13.JSP的内置对象及方法。
	/*request表示HttpServletRequest对象。它包含了有关浏览器请求的信息，并且提供了几个用于获取cookie, header, 和session数据的有用的方法。 
	response表示HttpServletResponse对象，并提供了几个用于设置送回浏览器的响应的方法（如cookies,头信息等） out对象是javax.jsp.JspWriter的一个实例，并提供了几个方法使你能用于向浏览器回送输出结果。 
	  pageContext表示一个javax.servlet.jsp.PageContext对象。它是用于方便存取各种范围的名字空间、servlet相关的对象的API，并且包装了通用的servlet相关功能的方法。 
	  session表示一个请求的javax.servlet.http.HttpSession对象。Session可以存贮用户的状态信息 
	  applicaton 表示一个javax.servle.ServletContext对象。这有助于查找有关servlet引擎和servlet环境的信息 
	  config表示一个javax.servlet.ServletConfig对象。该对象用于存取servlet实例的初始化参数。 
	page表示从该页面产生的一个servlet实例
	*/
//14.多线程有几种实现方法,都是什么?同步有几种实现方法,都是什么? 
	/*	多线程有两种实现方法，分别是继承Thread类与实现Runnable接口 
		同步的实现方面有两种，分别是synchronized,wait与notify
	*/
//15.jsp九大内置对象
	/*request           请求对象　            类型 javax.servlet.ServletRequest        作用域 Request
	response          响应对象              类型 javax.servlet.SrvletResponse        作用域 Page
	pageContext       页面上下文对象        类型 javax.servlet.jsp.PageContext       作用域 Page
	session           会话对象              类型 javax.servlet.http.HttpSession      作用域 Session
	application       应用程序对象          类型 javax.servlet.ServletContext        作用域 Application
	out               输出对象              类型 javax.servlet.jsp.JspWriter         作用域 Page
	config            配置对象              类型 javax.servlet.ServletConfig         作用域 Page
	page              页面对象              类型 javax.lang.Object                   作用域 Page
	exception         例外对象              类型 javax.lang.Throwable                作用域 page
	*/
//16.Static Nested Class和Inner Class 的不同。
	//使用static声明的内部类就是外部类，可以通过外部类.内部类直接访问。
	//普通的内部类是不能够直接被外部类访问的。需要通过外部类的实例再找到内部类事例。
//17.谈谈final.finally,finalize的区别。
	//final 是定义常量，方法，类的。声明的方法不能被覆写，声明的类不能被继承。
	//finally :是异常的统一出口
	//finalize : 是垃圾回收前的收尾工作，是object类定义的
//18.Anonymous Inner Class (匿名内部类）是否可以extends(继承）其他类，是否可以implements(实现）interface(接口）？
	//允许继承和实现，因为匿名内部类就是在抽象类和接口的基础上发展起来的。
//19.HashMap 和 Hashtable 的区别。
	/*hashMap jdk1.2之后推出，采用异步处理方式，性能较高，但是属于非线程安全，允许设置null
	hashtable jdk1.0推出，采用同步处理，性能低，线程安全，不允许设置null*/
//20.String s = new String("xyz)创建了几个对象？
	//产生了两个对象，一个是匿名对象“xyz",另外一个是通过关键字new实例化的。

//21.sleep()和wait()有什么区别？
	/*sleep()是Thread 类中定义的方法，表示线程的休眠，会自动唤醒
	wait()是object中定义的方法。需要手工调用notify（）或notifyAll()方法。*/
//22.String 有没有length()方法？
	//数组中 length的属性，  String 存在 length()方法

//23.overload 和override 的区别。overload的方法是否可以改变返回值得类型？
	
//24.常见的异常？、
	//ClassCastException,nullPointerException,ClassNotFoundException,ArrayOutIndexofBoundException,NumberFormatException
//25.abstract class 和 interface区别？
	//

//26.启动线程用run() 还是start()? start()方法

//27.try{}里有一个return语句，那么紧跟在这个try后的finally{}里的code会不会执行，什么时候执行，在return前还是后？
	//会执行，在return之前执行，只要是finall{}的代码永远会被执行。

//28.写出一个单利模式？



















