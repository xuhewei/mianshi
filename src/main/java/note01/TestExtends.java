package note01;

public class TestExtends {
	/**
	 * 怎么防治方法被重写，只要方法上加上final关键字就行
	 */
	public final void method(){
		
	}
	/*public void final method1(){  错误的定义
		
	}*/
	public static final void method2(){
		
	}
	/*public final abstract void method3(){错误的定义
		
	}*/
}
class TestExtendsNew extends TestExtends{
	/*@Override
	public final void method(){
		
	}
	@Override
    public static final void method2(){
		
	}*/
}
