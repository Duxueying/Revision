import java.util.Scanner;
public class Case2 {
    static class FibThread extends Thread{
        int n;
        FibThread(int n){
            this.n=n;
        }
        @Override
        public void run(){
            System.out.printf("fib(%d)=%d%n",n,fib(n));
        }
    }
    static long fib(int n){
        if(n<2){
           return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("请输入要计算的数：");
            int n=input.nextInt();
            input.nextLine();
            new FibThread(n).start();
        }
    }
}
