package src.DPPractice;

public class Fib {
        public int Fibonacci(int n) {
            if(n<=0){
                return 0;
            }
            int arr[]=new int[n+1];//保存子问题的解
            arr[0]=0;//这两个就是状态的初始化
            arr[1]=1;
            for(int i=2;i<=n;i++){
                arr[i]=arr[i-1]+arr[i-2];//状态转移方程
            }
            return arr[n];
        }
}
