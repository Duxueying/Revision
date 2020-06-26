package day6_26;
import java.util.*;
public class JZ45{
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5||numbers.length>5){//数组的长度不符合就直接返回错
            return false;
        }
        Arrays.sort(numbers);
        int count=0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){//把大小王的张数统计出来
                count++;
            }else{
                set.add(numbers[i]);//利用了set不允许重复的性质，防止有对子出现
            }
        }
        if((count+set.size())!=5){//和不为5说明有对子
            return false;
        }
        if((set.last()-set.first())<5){
            //因为是顺子，是个公差为1的数列，最大值减最小值肯定在5之内
            return true;
        }
        return false;
    }
}