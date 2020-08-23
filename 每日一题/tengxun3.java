package src.MeiTuan;
import java.util.Scanner;
public class tengxun3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (input.hasNext()) {
            if (n != 0) {
                int m = input.nextInt();
                int mid = m / 2;
                int max = 0;
                for (int i = 1; i <= mid; i++) {
                    int key1 = i;
                    int key2 = mid - i;
                    int he = getsum(key1) + getsum(key2);
                    if (he > max) {
                        max = he;
                    }
                }
                System.out.println(max);
            }
            n--;
        }
    }
    public static int getsum(int n){
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        return sum;
    }
}
