
    class MyThread1 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 20) {
                System.out.println("Thread1 is running");
                i++;
            }
        }
    }
    class MyThread2 extends Thread {
        @Override
        public void run() {
            int i = 0;
            while (i < 20) {
                System.out.println("Cat is walking");
                i++;
            }
        }
    }
    public class Multithreading_by_extends_Thread {
    public static void main(String[] args) {
    MyThread1 t1=new MyThread1();
    MyThread2 t2=new MyThread2();
    t1.start();
    t2.start();

    }
}
