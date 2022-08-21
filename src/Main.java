import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future future = executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("executor service");
            }
        });

        System.out.println(future.get()); //return null if task has finished successfully.

        // callable execution

        Future future1 = executorService.submit(new Callable() {
            @Override
            public String call() {
                return "Success";
            }
        });

        System.out.println(future1.get());
    }
}