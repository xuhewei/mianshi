package note01;


public class Test04 {
	
	public static void main(String[] args){
		//&和&&区别
		String str = null;
		if(str!=null&&!"".equals(str)){
			System.out.println("and ");
		}
		if(str!=null&!"".equals(str)){
			System.out.println("or");
		}
	
	}
}
