
public class shuXing {
    private static void printShuXing(){
        Thread t=Thread.currentThread();
        System.out.println(t.getId());//�߳�id
        System.out.println(t.getName());//�߳�����
        System.out.println(t.getState());//�̵߳�״̬
        System.out.println(t.getPriority());//�����߳����ȼ�
        System.out.println(t.isDaemon());//�ǲ��Ǻ�̨�߳�
        System.out.println(t.isAlive());//�ж��߳��Ƿ����
        System.out.println(t.isInterrupted());//�����Ƿ���ֹ
    }
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            printShuXing();
            try {
                //��������cpu��ô��ʱ�������»���;
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
    }
}
