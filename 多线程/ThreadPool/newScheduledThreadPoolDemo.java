package ThreadPool;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class newScheduledThreadPoolDemo {
    public static void main(String[] args) {
        //创建一个定长线程池，
        ScheduledExecutorService scheduleThreadPool=Executors.newScheduledThreadPool(5);
        scheduleThreadPool.scheduleAtFixedRate(new Runnable() {
            public void run(){
                System.out.println("延迟1s后每三秒执行一次");
            }
        } ,1,3, TimeUnit.SECONDS);
    }
}

