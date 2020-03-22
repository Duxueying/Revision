
public class shuXing {
    private static void printShuXing(){
        Thread t=Thread.currentThread();
        System.out.println(t.getId());//线程id
        System.out.println(t.getName());//线程名字
        System.out.println(t.getState());//线程的状态
        System.out.println(t.getPriority());//设置线程优先级
        System.out.println(t.isDaemon());//是不是后台线程
        System.out.println(t.isAlive());//判断线程是否活着
        System.out.println(t.isInterrupted());//现在是否被终止
    }
    public static void main(String[] args) {
        Thread t=new Thread(()->{
            printShuXing();
            try {
                //主动放弃cpu这么长时间再重新回来;
                Thread.sleep(10000000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t.start();
    }
}
