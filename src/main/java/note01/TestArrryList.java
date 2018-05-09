package note01;

import java.util.ArrayList;
import java.util.List;

public class TestArrryList {
	
	 public static void main(String[] args){
		 
		 // 6   9
		 // 2 6 5 6 3 5    --->3
		 
		 List<Integer> list = new ArrayList<Integer>();
		 list.add(0, 2);
		 list.add(1, 6);
		 list.add(2, 5);
		 list.add(3, 6);
		 list.add(4, 3);
		 list.add(5, 5);
		 
		 int num = 0;
		 int temp = 1;
		 temp = TestArrryList.getNum(list,num,temp);
		
		 
		 System.out.println(temp);
	 }
	
	 public static int getNum(List<Integer> list,int num,int temp){
		 int times = 0;
		 if(!list.isEmpty()){
		 for (int i = 0; i < list.size(); i++) {
			 ++times;
			 num +=list.get(i);
			 if(list.get(i) >= 9){
				 ++temp;
				 break;
			 }else if (num >= 9 ) {
				 ++temp;
				 break;
			 }
		}
		for(int j = 0;j < list.size();j++){
				 if(j <= times){
					 list.remove(j);
				 }
		}
			 getNum(list,num,temp);
		}
			 return ++temp;
	 }
}
