package day6_19;
/*��Ŀ����**����һ����ά�����У�ÿ��һά����ĳ�����ͬ����ÿһ�ж����մ����ҵ�����˳������
ÿһ�ж����մ��ϵ��µ�����˳�����������һ������������������һ����ά�����һ��������
�ж��������Ƿ��и�������
����˼·���������ԱȽϼ򵥣�����forѭ����һ���������鳤�ȣ�һ������ÿ��arr[i]�ĳ��ȣ��ҵ��ͷ���true;*/
public class JZ1{
    public static boolean Find(int target,int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;i++){
                if(array[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}