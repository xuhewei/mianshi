package note01.javase;


/*
java中数组操作的常见算法
			选择排序算法
			冒泡排序算法
			插入排序算法
			快速排序算法(jdk源码中有)
*/
public class ArrayDemo {
	public static void main(String[] args) {
		
		int[] arr = {3,1,9,5,7};
		//printArray(arr);

		//insertSort(arr);
		//printArray(arr);
		ArrayDemo.maopao(arr);
		System.out.println(arr[0]+","+arr[1]+","+arr[2]+arr[3]+arr[4]);

	}

	/*
		功能： 数组排序（插入排序算法）
		明确： 
			返回类型： void \ int[]
			未知内容： int[] arr	
	*/
	public static void insertSort (int[] arr) {
		//功能
		for (int x=1; x<arr.length; x++) {
			for (int y=x; y>0; y--) {
				//判断
				if (arr[y] < arr[y-1]) {
					int temp = arr[y];
					arr[y] = arr[y-1];
					arr[y-1] = temp;
				} else {
					break;
				}
			}
		}

	}
	//遍历数组元素  [1,3,9,5,7]
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int x=0; x<arr.length; x++) {
			//如果为最后一个元素， 不打印 逗号
			if (x == arr.length-1) {
				System.out.print(arr[x]);
			} else {
				System.out.print(arr[x]+",");
			}
		}
		System.out.println("]");
	}
	/**
	 * 冒泡排序
	 * @param a
	 */
	public static void maopao(int[] a){
		for(int i = 0;i<a.length;i++){
			//注意这里
			for(int j=i;j<a.length;j++){
				if(a[i]>a[j]){
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	}
	/**
	 * 冒泡排序
	 * @param unsorted
	 */
   public  static void bubble_sort(int[] unsorted)
    {
        for (int i = 0; i < unsorted.length; i++)
        {
            for (int j = i; j < unsorted.length; j++)
            {
                if (unsorted[i] > unsorted[j])
                {
                    int temp = unsorted[i];
                    unsorted[i] = unsorted[j];
                    unsorted[j] = temp;
                }
            }
        }
    }
}

