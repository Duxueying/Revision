public class StateChange {
    /*public static class MyThread extends Thread{
        @Override
        public void run(){
            for(int i=0;i<1000000;i++){

            }
        }
    }

    public static void main(String[] args) {
        MyThread t=new MyThread();
        System.out.println(t.getState());
        while(t.isAlive());
        System.out.println(t.getState());
    }*/
    public static class MyThread2 extends Thread{
        @Override
        public void run(){
            try {
                Thread.sleep(100*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread2 t=new MyThread2();
        t.start();
        System.out.println(t.getState());//还是Runnable.因为大概率情况下还没抢到cpu;
        Thread.sleep(1000);
        System.out.println(t.getState());
    }
}
