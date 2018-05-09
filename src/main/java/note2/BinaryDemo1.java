package note2;

public class BinaryDemo1 {
	
	public static void main(String args[]){
		System.out.println("测试整数转为二进制表示形式");
		int a = 10;
		System.out.println(Integer.toBinaryString(a));
		int a1 = 0x40;
        int b = 0x5A;
        System.out.println(Integer.toHexString(a1)); // 以十六进制显示
        System.out.println(Integer.toHexString(b));
 
        char c = '？';
        System.out.println(c);
	}
}
