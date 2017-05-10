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


