package day6_20;
public class JZ10{
    public int RectCover(int target) {
        int two=2,three=3;
        if(target<=3){//С��3�Ǿ��Ǳ���
            return target;
        }
        int result=0;
        for(int i=4;i<=target;i++){//��4��ʼ������쳲�����
            result=two+three;
            two=three;
            three=result;
        }
        return result;
    }
}