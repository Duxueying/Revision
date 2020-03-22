public class Case1 {
    static final int COUNT=10;
    static final long NUMBER=1000000000;

    static long sum(){
        long r=0;
        for(long i=0;i<NUMBER;i++){
            r+=i;
        }
        return r;
    }
    static void singleThread(){
        long b=System.nanoTime();
        for(int i=0;i<COUNT;i++){
           System.out.println(sum());
        }
        long e=System.nanoTime();
        double s=(e-b)/1000_000.0;
        System.out.printf("���߳�����ʱ�䣺%f%n",s);
    }
    static class SumThread extends Thread{
        @Override
        public void run(){
            System.out.println(sum());
        }
    }
    static void multiThread() throws InterruptedException {
        long b=System.nanoTime();//��ǰҲ����һ���̣߳�����ֻҪ�ڴ���COUNT-1���߳�
        Thread[] threads=new Thread[COUNT-1];
        for(int i=0;i<COUNT-1;i++){
            threads[i]=new SumThread();
            threads[i].start();
        }
        sum();
        for(int i=0;i<COUNT-1;i++){
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long e=System.nanoTime();
        double s=(e-b)/1000_000.0;
        System.out.printf("���߳�����ʱ�䣺%f%n",s);
    }

    public static void main(String[] args) throws InterruptedException {
        singleThread();
        multiThread();
    }
}
