package Multithreading.Threads;
public class ThreadWithDiffActions {

    public static void main(String[] args) {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        t1.start();
        t2.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        int pause;
        try {
            for(int i=0;i<10;i++){
                pause=(int)(Math.random()*3000);
                System.out.println("Hello!");
                sleep(pause);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        int pause;
        try {
            for(int i=0;i<10;i++){
                System.out.println(i);
                pause=(int)(Math.random()*3000);
                sleep(pause);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}