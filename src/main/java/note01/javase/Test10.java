package note01.javase;

public class Test10 {

	public static void main(String[] args){
		/**
		 * 6的二进制：0110 
			3的二进制：0011 
			位异或运算：相同取0，不同取1 
			结果:0101（5的二进制
		 */
		System.out.println(6^3);
		
		
		/**
		 * //执行完之后，i与j的值分别是多
		 */
		int i=1,j=10;
		do{
			if(i++>--j){//1 9 4 6 
				continue;
			}
		}while(i<5);
		
		System.out.println("i="+i+"j="+j);
		
		/**
		 * 
		 */
		System.out.println(2-1.1);//0.8999999999999999
		System.out.println(2.0-1.1); //1.9
		System.out.println(1.0-0.1);///0.9
	}
}
