class MyThreadRunnable1 implements Runnable {
    public void run() {
        int i=0;
        while (i < 50) {
            System.out.println("Hiii I am first");
            i++;
        }
    }
}
class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("This is second");
            i++;
        }
    }
}
public class Multithreading_by_runnable_interface {
    public static void main(String[] args) {
   MyThreadRunnable1 bullet=new MyThreadRunnable1();
   Thread gun=new Thread(bullet);
   MyThreadRunnable2 bullet2=new MyThreadRunnable2();
   Thread gun2=new Thread(bullet2);
   gun.start();
   gun2.start();
    }
}
