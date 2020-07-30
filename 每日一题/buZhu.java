package KeDaXunFei;

import java.util.Scanner;

/*小明想给老师当助教从而得一些补助。 老师会给小明一些作业让他去批改，并按批改的作业份数和批改正确率来确定小明的补助费。
老师是这么规定的，批改-份作业小明会得到m元，如果该份作业批改完全正确那么会从中扣除k元复查费:如果批改中出现了错误会从中
扣除x元当惩罚费用，此时这份作业不再扣除复查费。但是老师觉得小明勤工助学不容易，不想扣过多的费用，于是规定如果有一份作业
批改错误扣了x元， 那么可以抵消一份批改正确作业的复查费。举例,如果有两份作业，-份批改正确一份批改错误，那么错误的那份小
明可以得到m-x元，正确的那份小明可以得到m元，不用扣复查费。最后，你能算出小明一共能得多少补助么?

思路：最后的工资数是  批改份数*一份的钱-批改错误*扣除费-k*(正确-错误）；
当正确<错误时，批改份数*一份的钱-错误*x;
*/
public class buZhu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String[] num=input.nextLine().split(" ");//存放要输入的值
        int n=Integer.parseInt(num[0]);//把普通类型转成引用类型
        int m=Integer.parseInt(num[1]);
        int x=Integer.parseInt(num[2]);
        int k=Integer.parseInt(num[3]);
        int right=0;
        int wrong=0;
        String[] work=input.nextLine().split(" ");
        for(int i=0;i<work.length;i++){
            if(work[i].equals(" 0")){
                wrong++;
            }
            else{
                right++;
            }
        }
        if(right>=wrong){
            System.out.println(m*n-wrong*x-k*(right-wrong));
        }
        else{
            System.out.println(m*n-wrong*x);
        }
    }

}
