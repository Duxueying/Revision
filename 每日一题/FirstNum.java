
public class FirstNum{
    //Insert one char from stringstream
    public int[] cc = new int[256];
    public static int index = 1;//��¼Ԫ�ص��±�
    public void Insert(char ch)
    {
        //ÿ����һ��Ԫ�أ��±�+1
        if(cc[ch]==0){//��ǰλ��Ϊ0��˵�����ַ��ǵ�һ�γ���
            cc[ch]=index ++; //������Ϊ���±�
        }else{//���ǵ�һ�γ��֣�������Ϊ-1
            cc[ch]=-1;
        }
        //index ++;
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        int temp = Integer.MAX_VALUE;
        char res = '#';
        for(int i = 0; i<256; i ++) {//������Ӧ=0��˵��һ�ζ�û���֣�=-1.���ֲ�ֹ1�Σ������ǳ���һ�Σ�ȡֵΪԪ�ض�Ӧ�±꣬Ӧ�ҵ�ֻ����1�����±���С�ģ�Ϊ��һ��ֻ����1�ε�Ԫ��
            if(cc[i] != 0 && cc[i] != -1 && cc[i] < temp) {
                temp = cc[i];
                res = (char)i;
            }
        }
        return res;
    }
}