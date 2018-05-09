package note2;

public class Test002 {
	
	public static void main(String args[]){
		String str1 = "hello";
		String str2 = new String("hello");
		String str3 = new String("hello");
		char str4[] = {'h','e','l','l','o'};
		System.out.println("str1.equals(str2) = "+str1.equals(str2));
		System.out.println("str1.equals(str4) = "+str1.equals(str4.toString()));
		System.out.println("str2.equals(str3) = "+str2.equals(str3));
	    System.out.println("str1 == str2 = "+str1 == str2);
	    System.out.println("str2 == str3 = "+str2 == str3);
	    System.out.println(str1.hashCode() == str2.hashCode());
	    System.out.println(str3.hashCode() == str2.hashCode());
	}
}
