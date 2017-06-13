package note01.javase;


public class Test03 {
	public static void main(String[] args){
		//输出9*9口诀
		for(int x=1;x<10;x++){
			for(int y=1;y<=x;y++){
				System.out.print(x+"*"+y+"="+x*y+"\t");
			}
			System.out.println();
		}
		
	}
}
