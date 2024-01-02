package Multithreading.Threads;

public class ThreadsWithRunnable implements Runnable{

    private Thread thread1,thread2;

    public ThreadsWithRunnable(){
        thread1=new Thread(this);
        thread2=new Thread(this);
        thread1.start();
        thread2.start();
    }
    public static void main(String[] args) {
        // Method 1
        // Thread thread1=new Thread(new ThreadsWithRunnable());
        // Thread thread2=new Thread(new ThreadsWithRunnable());
        // Method 2
        // ThreadsWithRunnable runnable1=new ThreadsWithRunnable();
        // ThreadsWithRunnable runnable2=new ThreadsWithRunnable();
        // Thread thread1=new Thread(runnable1);
        // Thread thread2=new Thread(runnable2);
        // thread1.start();
        // thread2.start();
        ThreadsWithRunnable threadDemo=new ThreadsWithRunnable();
    }

    @Override
    public void run() {
        int pause;
        for(int i=0;i<10;i++){
            try {
                System.out.println(Thread.currentThread().getName() +" being executed.");
                pause=(int)(Math.random()*3000);
                Thread.sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

}