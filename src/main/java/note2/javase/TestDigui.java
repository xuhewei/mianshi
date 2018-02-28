package note2.javase;

public class TestDigui {
	public static void main(String[] args) {
		//int sum  = TestDigui.fun1(5);
		int sum  = TestDigui.fun2(5);
		System.out.println(sum);
	}
	/**
	 *  两种方法均可解决问题，递归法代码量会少于循环实现，当然在系统内存的方面，递归法比起循环会占用更多的开销。
	 * @param num
	 * @return
	 */
	public static int fun1(int num){
		if(num ==0 || num == 1 ){
			return 1;
		}else{
			return num*fun1(num - 1);
		}
		
	}
	public static int fun2(int num){
		
		if(num ==0||num == 1){
			return 1;
		}else{
			int value = 1;
			for(int i=num;i>1;i--){
				value *= i;
			}
			return value;
		}
	}
}

