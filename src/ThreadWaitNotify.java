public class ThreadWaitNotify {

    public static void main(String[] args) throws InterruptedException {
        ThreadExample thread1 = new ThreadExample();
        thread1.start();
        synchronized (thread1){
            thread1.wait();
        }
        System.out.println(thread1.sum);
    }
}
