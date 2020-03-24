import java.util.Scanner;

public class MyBlockingArrayQueue {
    int[] array = new int[10];
    int front = 0;
    int rear = 0;
    int size = 0;

    synchronized void put(int value) throws InterruptedException {
        if (size == array.length) {
            //throw new RuntimeException("队列已满");
           wait();
        }
        array[rear] = value;
        rear = (rear + 1) % array.length;
        notify();
        size++;
        //notify();
    }

    synchronized int take() {
        if (size == 0) {
            throw new RuntimeException("队列已满");
        }
        int value = array[front];
        front = (front + 1) % array.length;
        size--;
        notify();
        return value;
    }

    static MyBlockingArrayQueue queue = new MyBlockingArrayQueue();

    static class Producer extends Thread {
        @Override
        public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        queue.put(i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static void main(String[] args) throws InterruptedException {
            Producer producer = new Producer();
            producer.start();
            Thread.sleep(2 * 1000);
            Scanner scanner = new Scanner(System.in);
            while (true) {
                scanner.nextLine();
                System.out.println(queue.take());
            }
        }
    }
