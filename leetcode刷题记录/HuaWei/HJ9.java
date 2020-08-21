package src.NiuKe.HuaWei;

import sun.security.krb5.SCDynamicStoreConfig;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

//返回不含重复数字的一串数，比如输入9876673，输出37689
public class HJ9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String str = String.valueOf(num);
        char[] arr = str.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
                System.out.print(arr[i]);
            }
        }
    }
}
