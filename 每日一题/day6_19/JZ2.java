package day6_19;
/***��Ŀ����**����ʵ��һ����������һ���ַ����е�ÿ���ո��滻�ɡ�%20����
 ���磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 ����˼·���õ���StringBuffer�ķ������Ӻ���ǰ��������������ڿո񣬾�ɾ�ˣ�Ȼ���%20���ȥ��*/
public class JZ2{
    public String replaceSpace(StringBuffer str) {
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){//charAt(i):���iλ�õ�Ԫ��
                str.deleteCharAt(i);
                str.insert(i,"%20");
            }
        }
        return str.toString();//ת���ַ���
    }
}
