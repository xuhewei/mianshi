package note01;


public class YangHui {
    public static void main(String[] args) {
        int [][] iArray = new int[10][];
        
        //保证输出10行    
        for(int i=0;i<10;i++) {
            //行是从0开始 列数加1 否则出现空指针异常
            iArray[i] = new int[i+1];
            //从第一行开始 依次给每行加不同的空格
            for(int k=9;k>i;k--){
                System.out.print("  ");
            }
            //控制每行输出的元素
            for(int j=0;j<=i;j++) {
                if(j==0 || j==i) {
                    //两边的值
                    iArray[i][j]=1;
                    System.out.print(iArray[i][j]+"   ");
                }else{
                    //中间的值
                    iArray[i][j]=iArray[i-1][j]+iArray[i-1][j-1];
                    System.out.print(iArray[i][j]+"   ");
                }
                
            }
            System.out.println();//换行
        } 
    }
}