package day6_26;
import java.util.*;
public class JZ45{
    public boolean isContinuous(int [] numbers) {
        if(numbers.length<5||numbers.length>5){//����ĳ��Ȳ����Ͼ�ֱ�ӷ��ش�
            return false;
        }
        Arrays.sort(numbers);
        int count=0;
        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==0){//�Ѵ�С��������ͳ�Ƴ���
                count++;
            }else{
                set.add(numbers[i]);//������set�������ظ������ʣ���ֹ�ж��ӳ���
            }
        }
        if((count+set.size())!=5){//�Ͳ�Ϊ5˵���ж���
            return false;
        }
        if((set.last()-set.first())<5){
            //��Ϊ��˳�ӣ��Ǹ�����Ϊ1�����У����ֵ����Сֵ�϶���5֮��
            return true;
        }
        return false;
    }
}