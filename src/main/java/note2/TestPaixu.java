package note2;

public class TestPaixu {
	
	public static void main(String [] args){
		
		int [] arr = {6,2,3,4,9};
		
		int a,b,c = 0;
		
		for(int i = 0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-i-1;j++){
				if(arr[j] < arr[j+1]){
					a = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = a;
				}
			}
		}
		
		for(int s = 0; s<arr.length;s++){
			System.out.println(arr[s]);
		}
	}
	
}
