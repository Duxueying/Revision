import java.util.Scanner;

public class playGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int child=input.nextInt();
        int call=input.nextInt();
       System.out.println(LastRemaining_Solution(child,call));
    }
    public static int LastRemaining_Solution(int n, int m) {
        if (n == 0 || m == 0) {
            return -1;
        }
        int s = 0;
        for (int i = 2; i <= n; i++) {
            s = (s + m) % i;
        }
        return s;
    }
}
