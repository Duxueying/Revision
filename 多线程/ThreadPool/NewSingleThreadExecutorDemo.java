package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewSingleThreadExecutorDemo {
    public static void main(String[] args) {
        //创建一个单线程版的线程池
        ExecutorService singleThreadExecutor=Executors.newSingleThreadExecutor();

        for(int i=0;i<10;i++){
            int index=i;
            singleThreadExecutor.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"打印的值是"+index);
                }
            });
        }
    }
}
