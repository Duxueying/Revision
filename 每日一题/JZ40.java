package day6_24;
//����һ
public class JZ40
        public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
            int num=0;
            for(int i=0;i<array.length;i++){
                num^=array[i];//��������򣬽��Ϊ��ͬ���������ֵ����
            }
            int count=0;//��־λ����¼num�еĵ�һ��1���ֵ�λ��
            for(;count<array.length;count++){
                if((num&(1<<count))!=0){
                    break;
                }
            }
            num1[0]=0;
            num2[0]=0;
            for(int i=0;i<array.length;i++){
                if((array[i]&(1<<count))==0){//��־λΪ0��Ϊһ�飬����صõ�һ�����֣�����ע��==�����ȼ�����&������ǰ��ӣ�����
                    num1[0]^=array[i];
                }else{
                    num2[0]^=array[i];//��־λΪ1��Ϊһ��
                }
            }
        }
}
//������
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            if(map.containsKey(array[i])){
                map.put(array[i],2);
            }else{
                map.put(array[i],1);//�ѵ������������ͳ�Ƴ�����
            }
        }
        int count=0;
        for(int i=0;i<array.length;i++){
            if(map.get(array[i])==1){
                if(count==0){
                    num1[0]=array[i];
                    count++;
                }
                else{
                    num2[0]=array[i];
                }
            }
        }
    }
}