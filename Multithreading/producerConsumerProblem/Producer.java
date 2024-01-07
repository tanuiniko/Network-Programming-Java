package Multithreading.producerConsumerProblem;


class Producer extends Thread {
    private Resource item;

    public Producer(Resource resource){
        item=resource;
    }

    public void run(){
        int pause;
        int newLevel;
        do{
            try {
                newLevel=item.addOne();
                System.out.println("<Producer> New Level : "+newLevel);
                pause=(int)(Math.random()*5000);
                sleep(pause);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }while(true);
    }
}