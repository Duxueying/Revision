import java.util.Scanner;
public class ThreadStop {
   public static class
   doWork implements Runnable{
        @Override
        public void run () {
        Thread current = Thread.currentThread();
        while (Thread.interrupted()) {//!current.isInterrupted()
            try {
                System.out.println("��һ����ҵ");
                Thread.sleep(3 * 1000);
                System.out.println("�ڶ�����ҵ");
                Thread.sleep(3 * 1000);
                System.out.println("��������ҵ");
                Thread.sleep(3 * 1000);
                System.out.println("���ķ���ҵ");
                Thread.sleep(3 * 1000);
                System.out.println("�������ҵ");
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t=new Thread(new doWork());
        t.start();
        Scanner input=new Scanner(System.in);
        input.nextLine();
        System.out.println("׼��ֹ֪ͨͣд��ҵ");
        t.interrupt();
        System.out.println("�Ѿ�ֹ֪ͨͣд��ҵ");
        t.join();
        System.out.println("�Ѿ�ֹͣд��ҵ");
    }
}
