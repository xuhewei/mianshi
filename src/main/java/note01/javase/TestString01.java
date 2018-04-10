package note01.javase;

public class TestString01 {
	
	public static void main(String[] args){
		
		//
		String str1 = new String("hello");
		String str2 = new String("hello");
		String str3 = "hello";
		String str4 = "hello";
		
		System.out.println(str3 == str1);
		System.out.println(str1 == str2);
	    System.out.println(str3 == str4);
		
	    
		String str = new String("hello");
		TestString01.modifyStr(str);
		System.out.println(str);
	}
	public static void modifyStr(String str){
		str += "world";
	}
}
