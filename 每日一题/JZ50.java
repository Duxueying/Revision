package day6_26;
import java.util.TreeSet;
public class JZ50 {
    // ����Ҫ�ر�ע��~���������ظ���һ������ֵduplication[0]
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(length==0){
            return false;
        }
        TreeSet<Integer> set=new TreeSet();
        for(int i=0;i<numbers.length;i++){
            set.add(numbers[i]);
            if(set.size()!=i+1){
                duplication[0]=numbers[i];
                return true;
            }
        }
        return false;
    }
}