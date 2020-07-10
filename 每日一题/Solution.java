/*输入薯券金额、商品分别价格
        例如：10 [2,3,5]
        10与[2,3,5]中间有空格

        输出描述:
        输出4，则结果集可以为:2,2,2,2,2；5,5；2,3,5；2,2,3,3共有4种组合

        输入例子1:
        10 [2,3,5]

        输出例子1:
        4*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       int sum=input.nextInt();//sum也就是署卷的金额
       String str=input.next();//输入一个字符串，像下面的[2,3,5]
       int length=str.length();
       System.out.println(length);//这里输出7，为了查看一下输入的跟上面长度一样不
       String subString=str.substring(1,length-1);//把里面的数字截取出来
       String[] split=subString.split(",");
       int[] price=new int[split.length];
       for(int i=0;i<split.length;i++){
            price[i]=Integer.parseInt(split[i]);//把字符型转成int型
        }
        int[][] zuhe=new int[price.length+1][sum+1];//存储组合数
       for(int i=0;i<zuhe.length;i++){
           zuhe[i][0]=1;
       }
       for(int i=1;i<=price.length;i++){
          for( int j=1;j<=sum;j++){
              if(price[i-1]<=j){
                  zuhe[i][j]=zuhe[i-1][j]+zuhe[i][j-price[i-1]];
              }else
              {
                  zuhe[i][j]=zuhe[i-1][j];
              }
          }
       }
        System.out.println(zuhe[price.length][sum]);
    }
}
