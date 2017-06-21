package note01.javase;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
	
	public static void main(String[] args) {
		
		
		// 输入三个整数x,y,z，请把这三个数由小到大输出。
		input fnc = new input();
		int x = 0, y = 0, z = 0;
		System.out.print("输入第一个数字：");
		x = fnc.input();
		System.out.print("输入第二个数字：");
		y = fnc.input();
		System.out.print("输入第三个数字：");
		z = fnc.input();
		//编译都不通过还创建什么,泛型不允许是基本数据类型
		//List<int> list = new ArrayList<int>();
		List<Integer> list = new ArrayList<Integer>();
		list.add(x);
		list.add(y);
		list.add(z);
		list.sort(null);
		/*if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x > z) {
			int t = x;
			x = z;
			z = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}*/
		System.out.println(list);
		//System.out.println("三个数字由小到大排列为： " + x + " " + y + " " + z);
	}
}

class input {
	public int input() {
		int value = 0;
		Scanner s = new Scanner(System.in);
		value = s.nextInt();
		return value;
	}
}
