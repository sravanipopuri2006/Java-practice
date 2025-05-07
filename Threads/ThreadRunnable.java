package Threads;
public class ThreadRunnable implements Runnable{
    public static void main(String[] args) {
        ThreadRunnable th1=new ThreadRunnable();
        Thread thread=new Thread(th1);//pasing the object for the user defined class
        thread.start();
        ThreadRunnable th2=new ThreadRunnable();
        Thread thread1=new Thread(th2);
        thread1.start();

    }
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println(i);
        }
    }

    
}
