package Multithreading.Threads;

public class ThreadShowName extends Thread{
    public static void main(String[] args) {
        withNoExtend();
        withExtend();
    }

    // there are about 6-8 constuctors of thread class.
    public static void withNoExtend(){
        Thread firstThread = new Thread();
        Thread secondThread = new Thread("namedThread");
        System.out.println(firstThread.getName());
        System.out.println(secondThread.getName());
    }

    public static void withExtend(){
        ThreadShowName thread1, thread2;
        thread1=new ThreadShowName();
        thread2=new ThreadShowName();
        thread1.start();
        thread2.start();
    }

    public void run(){
        int pause;
        for(int i=0;i<10;i++){
            try {
                System.out.println(getName()+" being executed.");
                pause=(int)(Math.random()*3000);
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}