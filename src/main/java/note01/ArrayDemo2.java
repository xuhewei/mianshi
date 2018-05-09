package note01;

public class ArrayDemo2{
	public static void main(String[] args){
		int [] arr = {3,5,8,9,12,56};
		int min = 0;
		int max = arr.length -1;
		
		int num =9;
		int index =-1;
		while(min<=max){
			int mid =(min+max)/2;
			if(arr[mid]==num){
				index = mid;
				break;
			}else if(arr[mid]>num){
				max = mid-1;
			}else{
				min =mid+1;
			}
		}
		System.out.println("11111="+index);
	}
}