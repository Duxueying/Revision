package src.niuKe;
import java.util.Scanner;
public class strToInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(get(str));
    }

    public static int get(String str) {
        if (str.length() == 0 || str.equals(" ")) {//字符串为空返回0
            return 0;
        }
        int i=0;
        int sum = 0;
        boolean flag = false;
        if (str.charAt(0) == '-') {//负数就从1开始
            i = 1;
            flag = true;//说明这个数是正数
        }
        for (int len=str.length(); i < len; i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                sum = sum * 10 + str.charAt(i) - '0';
            } else {
                return 0;
            }
        }
        if (flag) {
            return -sum;
        } else {
            return sum;
        }
    }
}
