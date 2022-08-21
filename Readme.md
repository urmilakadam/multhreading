Executor Service
Java.util.concurrent.ExecutorService interface is a new way of executing tasks asynchronously in the background. An executor service is very similar to thread pool.

   ExecutorService executorService = Executors.newSingleThreadExecutor();

    executorService.execute(new Runnable() {
        @Override
        public void run() {
            System.out.println("executor service");
        }
    });
}

Ways to create Thread:
1.    ExecutorService executorService = Executors.newSingleThreadExecutor();
2.    ExecutorService executorService = Executors.newFixedThreadPool(10);
3.    ExecutorService executorService = Executors.newScheduledThreadPool(10);

How to check whether an ExecutorService task executed successfully?
We can use a Future to check the return value. 

    Future future = executorService.submit(new Runnable() {
        @Override
        public void run() {
            System.out.println("executor service");
        }
    });

    System.out.println(future.get()); //return null if task has finished successfully.
}


Inter-thread communication methods:
1. Wait —> wait for another thread to notify
2. Notify—> notify other waiting threads.
3. notifyAll —> if more than one thread is in waiting then notify all the threads by using notifuAll method.
