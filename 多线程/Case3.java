public class Case3 {
    private static class A extends Thread{
        @Override
        public void run(){
            System.out.println("����A");
        }
    }

    private static class B extends Thread{
        @Override
        public void run(){
            System.out.println("����B");
        }
    }
    public static void main(String[] args) {
        A a=new A();
        B b=new B();//��a b�������������
        b.setPriority(Thread.MAX_PRIORITY);//�������ȼ���Ҳ��һ���ٷְ���ǰ�棩
        a.start();
        b.start();
        System.out.println("�������߳�");
    }
}
