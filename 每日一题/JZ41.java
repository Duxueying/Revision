package day6_26;
import java.util.ArrayList;
public class JZ41{
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //这个n就是根据求和公式所得到得最大序列长，最小由题意知是2
        for(int n=(int)Math.sqrt(2*sum);n>=2;n--){
            //n&1等于1说明n不为0，sum%n==0说明序列为奇数，后面说明序列长为偶数，
            //后面是偶数的情况，余数是除数的一半，比如5、6、7、8、合为26，余数为2商为4.
            if ((n&1) ==1&&sum%n==0||(sum%n)*2 == n){
                ArrayList<Integer> answer=new ArrayList<>();
                //决定这个序列的起始值是几，sum/n是中间那个值，往前推（n-1）/2就是起始值，
                for (int j = 0,k =(sum/n)-(n-1)/2;j<n;j++,k++){
                    answer.add(k);
                }
                list.add(answer);
            }
        }
        return list;
    }
}