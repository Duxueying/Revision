package src.DPPractice;
import java.util.*;
public class rabit {
        public int uniquePaths (int m, int n) {
            if(m==0||n==0)
                return 0;
            int[][] arr=new int[m][n];
            for(int i=1;i<n;i++){//两个for循环进行初始化
                arr[0][i]=1;
            }
            for(int i=0;i<m;i++){
                arr[i][0]=1;
            }
            for(int i=1;i<m;i++){
                for(int j=1;j<n;j++){
                    arr[i][j]=arr[i-1][j]+arr[i][j-1];//状态转移方程，这一步可以有前面这两部走过来
                }
            }
            return arr[m-1][n-1];
        }
}
