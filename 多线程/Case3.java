public class Case3 {
    private static class A extends Thread{
        @Override
        public void run(){
            System.out.println("我是A");
        }
    }

    private static class B extends Thread{
        @Override
        public void run(){
            System.out.println("我是B");
        }
    }
    public static void main(String[] args) {
        A a=new A();
        B b=new B();//把a b放入就绪队列中
        b.setPriority(Thread.MAX_PRIORITY);//设置优先级（也不一定百分百在前面）
        a.start();
        b.start();
        System.out.println("我是主线程");
    }
}
