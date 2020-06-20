package day6_20;
/**��Ŀ����**������һ�����󣬰��մ���������˳ʱ���˳�����δ�ӡ��ÿһ�����֣����磬�����������4 X 4����
 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 �����δ�ӡ������1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 ����˼·**���ȰѲ����������Ȼ�����δ������ҡ������������£��������󣬴����������ϴ�ӡ*/

import java.util.ArrayList;
public class JZ19 {
    public ArrayList<Integer> printMatrix(int [][] arr) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        int n = arr.length,m = arr[0].length;
        if(m==0||n==0)
            return result;
        int layers = (Math.min(n,m)-1)/2+1;//�����Բ�Ĳ�������������Ĳ���
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) {//������
                result.add(arr[i][k]);
            }
            for(int j=i+1;j<n-i;j++){//����������
                result.add(arr[j][m-i-1]);
            }
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--){//������
                result.add(arr[n-i-1][k]);
            }
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) {//����������
                result.add(arr[j][i]);
            }
        }
        return result;
    }
}


