package src.NiuKe.HuaWei;
//7个苹果，放到三个盘子里；
//分两种情况，当没有盘子空着、每个盘子各放一个苹果时，就是把m-n个苹果放到n个盘子里，
//第二种当有一个盘子空着时，就是把m个苹果放到n-1个盘子里；
import java.util.Scanner;
public class HJ61 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            if(m<1 || n>10){
                System.out.println(-1);
            }else{
                System.out.println(shareCount(m,n));
            }
        }
    }
    public static int shareCount(int m,int n){
        if(m<0){
            return 0;
        }
        if(m==1||n==1){
            return 1;
        }
        return shareCount(m,n-1)+shareCount(m-n,n);
    }
}
