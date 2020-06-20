package day6_20;
/**题目描述**：输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵
 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 解题思路**：先把层数算出来，然后依次从左向右、从右上至右下，从右至左，从左下至左上打印*/

import java.util.ArrayList;
public class JZ19 {
    public ArrayList<Integer> printMatrix(int [][] arr) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        int n = arr.length,m = arr[0].length;
        if(m==0||n==0)
            return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是圆的层数，不是数组的层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) {//左至右
                result.add(arr[i][k]);
            }
            for(int j=i+1;j<n-i;j++){//右上至右下
                result.add(arr[j][m-i-1]);
            }
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--){//右至左
                result.add(arr[n-i-1][k]);
            }
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) {//左下至左上
                result.add(arr[j][i]);
            }
        }
        return result;
    }
}


