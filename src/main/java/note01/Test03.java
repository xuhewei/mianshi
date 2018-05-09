package note01;


public class Test03 {
	public static void main(String[] args){
		//输出9*9口诀
		for(int x=1;x<10;x++){
			for(int y=1;y<=x;y++){
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
		}
		//输出三角形
		for(int i=0;i<10;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		//输出等腰三角形
		for(int i=10;i>0;i--){
			for(int j=i;j>=0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
