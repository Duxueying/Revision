import java.util.*;
public class DNA_order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = " ";
        while ((str = input.nextLine()) != null) {
            int n = input.nextInt();
            get(str, n);
        }
    }

    public static void get(String s, int n) {
        int num2 = 0;
        int count = 0;
        int len = s.length();
        String str = " ";
        for (int i = 0; i <= len - n; i++) {//第一个循环来遍历这个序列
            for (int j = i; j < i + n; j++) {//第二个循环控制在这个N长度内再来算G和C的个数
                if (s.charAt(j) == 'G' || s.charAt(j) == 'C') {
                    count++;
                }
                if (count > num2) {
                    num2 = count;
                    str = s.substring(i, i + n);//用substring把这段切下来
                }
            }
        }
        System.out.println(str);
    }
}
