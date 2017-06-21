package note01.javase;

import java.util.HashSet;
import java.util.Set;
/**
 * @author gut
 *
 */
public class ArrayDemo1 {
	
	public  static void main(String[] args){
		String[] a = {"1","2","4","6","9","10","11"};
		String[] b = {"1","2","4","6","8"};
		
		Set<String> set = ArrayDemo1.getDiff(a, b);
		System.out.println(set);
		//foreach遍历set集合
	    for(String str:set){
	    	System.out.println(str);
	    }
	    System.out.println("set.size>>>>>>>>>="+set.size());
	}
	/**
	 * 找出两个集合a集合单独存在，不同于b数据的元素
	 * @param a
	 * @param b
	 * @return
	 */
	public static Set<String> getDiff(String[] a ,String[] b){
		 Set<String> diffElementSet = new HashSet<String>();//存放a有b没有
	     Set<String> tempSet = new HashSet<String>();       //存放b数组的元素集合
		
		for (int i =0; i<b.length;i++) {
			tempSet.add(b[i]);
		}
		
		for (int i =0; i<a.length;i++) {
			if(tempSet.add(a[i])){
				diffElementSet.add(a[i]);
			}
		}
		return diffElementSet;
	}
	/**
	 * 找出两个数组中相同的元素
	 * @param a
	 * @param b
	 * @return
	 */
	public static Set<String> getSame(String[] a,String[] b){
		Set<String> sameElementSet = new HashSet<String>();//存放a有b没有
	     Set<String> tempSet = new HashSet<String>();       //存放b数组的元素集合
	     //实现同上
	     return sameElementSet;
	}
}
