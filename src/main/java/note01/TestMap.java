package note01;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


/**
 * 
 * @author xuhewei
   @date 2018/03/15
 * 怎么创建一个线程安全hashmap
 */
public class TestMap {
	public static void main(String[] args){
		
		//Hashtable
		Map<String, String> hashtable = new Hashtable<>();

		//synchronizedMap
		Map<String, String> synchronizedHashMap = Collections.synchronizedMap(new HashMap<String, String>());

		//ConcurrentHashMap
		Map<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		System.out.println("我是徐贺伟");
	}
}
