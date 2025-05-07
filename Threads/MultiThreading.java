package Threads;
public class MultiThreading extends Thread {
    public static void main(String[] args) {
        MultiThreading thread1=new MultiThreading();
        thread1.start();
        MultiThreading thread2=new MultiThreading();
        thread2.start();

        
    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(i);
        }


    }
}
