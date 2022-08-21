public class ThreadExample extends Thread{

    public long sum=0;

    @Override
    public void run() {
       synchronized (this){
           for(int i=0; i< 10000; i++){
               sum=sum+i;
           }
           notify();
       }
    }
}
