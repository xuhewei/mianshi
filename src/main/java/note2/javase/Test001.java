package note2.javase;


public class Test001 {
	public char c;
	public Test001(){
	}
	public Test001(char i){
		c=i;
	}
	public void setValue(int x){
		x = x +1;
		System.out.println(" x2="+x);
	}
	//两个基本数据类型==号比较的是值是否相等，
	//如果是引用数据类型（对象）比较的是两个对象时否时同一个对象，比较的是内存地址
	public static void main(String args[]){
		  int s1 = 1;
		  int s2 = 1;
		  System.out.println(s1 == s2); 
		  
		  Test001 a = new Test001('中');
		  Test001 b = new Test001('中');
		  Test001 d = b;
		  char e = '中';
		  System.out.println(a==b);
		  System.out.println(b==d);
		  //System.out.println(a==e);
		  System.out.println(a.equals(b));
		  System.out.println(a.equals(e));

		  
		  int x = 1;
		  Test001 rt = new Test001();
		  System.out.println(" x1="+x);
		  rt.setValue(x);
		  System.out.println(" x3="+x);
		  
	}
}
