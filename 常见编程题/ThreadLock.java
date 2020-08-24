package src.NiuKe;

public class ThreadLock {
    private static  final  Object A=new Object();
    private static  final  Object B=new Object();

    public static void main(String[] args) {
        new Thread(){
            public void run(){
                synchronized (A){
                    synchronized (B){
                        System.out.println("拿到A的锁并且拿到B的锁");
                    }
                }
            }
        }.start();
        
        new Thread(){
            public void run(){
                synchronized (B){
                    synchronized (A){
                        System.out.println("拿到B的锁并且拿到A的锁");
                    }
                }
            }
        }.start();
    }
}
