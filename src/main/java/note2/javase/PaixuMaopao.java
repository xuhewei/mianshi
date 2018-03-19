package note2.javase;

public class PaixuMaopao {
	
	public static void main(String [] args){
		
		 int [] a = {2,6,4,5,1,7,3};
		 //冒泡排序
		 int i = 0;
		 int j = 0;
		 int n = 0;
		 for(i = 0;i < a.length-1;i++){
			 for(j = 0; j<a.length-i-1;j++){
				 if(a[j]>a[j+1]){
					
					 n = a[j];
					 a[j] = a[j+1];
					 a[j+1] = n;
				 }
			 }
		 }
		
		 for(i = 0; i<a.length;i++){
			 System.out.print(a[i]);
		 }
		 
		 //选择排序
		 
		/* int b = 0;
		 int c = 0;
		 int d = 0;
		 for(b = 0; b < a.length; b++){
			 for(c = b+1; c < a.length; c++){
				 if(a[b] < a[c]){
					 d = a[b];
					 a[b] = a[c];
					 a[c] = d;
				 }
			 }
		 }
		 for( b = 0; b<a.length;b++){
			 System.out.print(a[b]);
		 }*/
		 System.out.println(5&6);
	}
}
