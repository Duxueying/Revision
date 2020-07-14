package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewFixedThreadPoolDemo {
    public static void main(String[] args) {
        //创建一个可重用固定数量的线程池
        ExecutorService fixedThreadPool=Executors.newFixedThreadPool(4);
        for(int i=0;i<10;i++){
            fixedThreadPool.execute(new Runnable() {
                @Override
                public void run() {
                    try{
                        System.out.println(Thread.currentThread().getName()+"正在被执行");
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } ;
                }
            });
        }
    }

}
