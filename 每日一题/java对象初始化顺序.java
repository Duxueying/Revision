
class Father {//���Ǹ���
    public Father() {
        System.out.println("10�������޲ι��췽��");//���Ǹ�����޲ι��췽��
    }
    static {
        System.out.println("1�����ྲ̬�����1");//����ĵ�һ����̬�����
    }
    private static int a = TestClass.fatherStaticMemberVarInit();//����ľ�̬��Ա����
    static {
        System.out.println("3�����ྲ̬�����2");
    }
    {
        System.out.println("7��������ͨ�����1");
    }
    private int b = TestClass.fatherMemberVarInit();//�������ͨ��Ա����
    {
        System.out.println("9��������ͨ�����2");
    }
    public Father(int v) {
        System.out.println("������ι��췽��");
    }
}

class Son extends Father {
    static {
        System.out.println("4�����ྲ̬�����1");
    }
    private static int a = TestClass.sonStaticMemberVarInit();//���ྲ̬��Ա����
    static {
        System.out.println("6�����ྲ̬�����2");
    }
    {
        System.out.println("11��������ͨ�����1");
    }
    private int b = TestClass.sonMemberVarInit();//������ͨ��Ա����
    {
        System.out.println("13��������ͨ�����2");
    }
    public Son() {
        // super(2018);
        System.out.println("14�����๹�췽��");
    }
}

class TestClass{
    public static int fatherStaticMemberVarInit() {
        System.out.println("2�����ྲ̬��Ա����");
        return 0;
    }
    public static int fatherMemberVarInit() {
        System.out.println("8��������ͨ��Ա����");
        return 0;
    }
    public static int sonStaticMemberVarInit() {
        System.out.println("5�����ྲ̬��Ա����");
        return 0;
    }
    public static int sonMemberVarInit() {
        System.out.println("12��������ͨ��Ա����");
        return 0;
    }
}

public class java�����ʼ��˳�� {
    public static void main(String[] args) {
        Son son1 = new Son();
        System.out.println("===================");
        Son son2 = new Son();
    }
}