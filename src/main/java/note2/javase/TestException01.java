package note2.javase;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.locks.Lock;  
import java.util.concurrent.locks.ReentrantLock;  
  
public class TestException01 {  
	public static String outPut  = "";
	public static void foo(int i){
		try{
			if(i == 1){
				throw new Exception();
			}
			outPut += "1";
		}catch(Exception e){
			outPut +="2";
			return;
		}finally{
			outPut += "3";
		}
		outPut +="4";
	}
    public static void main(String[] args) {  
    	foo(0);
    	foo(1);
    	System.out.println(outPut);
    }
}  
  
