package note01.javase;

public class TestString01 {
	
	public static void main(String[] args){
		String str = new String("hello");
		TestString01.modifyStr(str);
		System.out.println(str);
	}
	public static void modifyStr(String str){
		str += "world";
	}
}
