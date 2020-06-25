package day6_26;
import java.util.ArrayList;
public class JZ41{
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //���n���Ǹ�����͹�ʽ���õ���������г�����С������֪��2
        for(int n=(int)Math.sqrt(2*sum);n>=2;n--){
            //n&1����1˵��n��Ϊ0��sum%n==0˵������Ϊ����������˵�����г�Ϊż����
            //������ż��������������ǳ�����һ�룬����5��6��7��8����Ϊ26������Ϊ2��Ϊ4.
            if ((n&1) ==1&&sum%n==0||(sum%n)*2 == n){
                ArrayList<Integer> answer=new ArrayList<>();
                //����������е���ʼֵ�Ǽ���sum/n���м��Ǹ�ֵ����ǰ�ƣ�n-1��/2������ʼֵ��
                for (int j = 0,k =(sum/n)-(n-1)/2;j<n;j++,k++){
                    answer.add(k);
                }
                list.add(answer);
            }
        }
        return list;
    }
}