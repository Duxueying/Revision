package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewCachedThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException {
        //创建一个可缓存线程池
        ExecutorService cachedThreadPool=Executors.newCachedThreadPool();
        for(int i=0;i<10;i++){
            Thread.sleep(10);
        }
        cachedThreadPool.execute(new Runnable() {
            //@Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"正在运行");
            }
        });
    }
}