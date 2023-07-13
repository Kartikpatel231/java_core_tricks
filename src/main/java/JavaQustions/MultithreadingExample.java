package JavaQustions;
public class MultithreadingExample {
    public static void main(String[] args) throws InterruptedException {
        startThread("Thread 1");
        startThread("Thread 2");
        System.out.println("All threads have been started.");
    }
    private static void startThread(String threadName) {
        new Thread(() -> {
            System.out.println(threadName + " is running.");
            for (int i = 1; i <= 2; i++) {
                System.out.println(threadName + ": " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(threadName + " has finished executing.");
        }, threadName).start();
    }
}
