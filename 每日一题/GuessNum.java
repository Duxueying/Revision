package GuangLianDa;

import java.util.Scanner;

public class GuessNum {
    public static void main(String[] args) {
        int num = 7;
        int count = 0;
        System.out.println("请输入一个数");
        Scanner input = new Scanner(System.in);
       // int guess= input.nextInt();
       while(count<10){
           int guess= input.nextInt();
           count++;
            if (guess > num) {
                System.out.println("猜大了,请重新输入");
                //count++;
            } else if (guess< num) {
                System.out.println("猜小了，请重新输入");
                //count++;
            } else {
                System.out.println("恭喜你，猜对了");
                //count++;
                break;
            }
        }
    }
}
