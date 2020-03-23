import java.util.Scanner;
public class ThreadStop {
   public static class
   doWork implements Runnable{
        @Override
        public void run () {
        Thread current = Thread.currentThread();
        while (Thread.interrupted()) {//!current.isInterrupted()
            try {
                System.out.println("第一份作业");
                Thread.sleep(3 * 1000);
                System.out.println("第二份作业");
                Thread.sleep(3 * 1000);
                System.out.println("第三份作业");
                Thread.sleep(3 * 1000);
                System.out.println("第四份作业");
                Thread.sleep(3 * 1000);
                System.out.println("第五份作业");
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
        System.out.println("准备通知停止写作业");
        t.interrupt();
        System.out.println("已经通知停止写作业");
        t.join();
        System.out.println("已经停止写作业");
    }
}
