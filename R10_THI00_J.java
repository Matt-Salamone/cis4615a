/**
 * Rule 10: Thread APIs (THI)
 * THI00-J: Do not invoke Thread.run().
 * COMPLIANT: Start the worker thread using start().
 */
public class R10_THI00_J {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            System.out.println(
                "Task executed on: " + Thread.currentThread().getName()
            );
        }, "background-worker");

        worker.start();
        worker.join();
    }
}
