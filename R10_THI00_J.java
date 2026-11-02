/**
 * Rule 10: Thread APIs (THI)
 * THI00-J: Do not invoke Thread.run().
 *
 * NONCOMPLIANT: run() is called instead of start().
 */
public class R10_THI00_J {

    public static void main(String[] args) {
        Thread worker = new Thread(() -> {
            System.out.println(
                "Task executed on: " + Thread.currentThread().getName()
            );
        }, "background-worker");

        // Vulnerability: executes on the calling thread.
        worker.run();
    }
}
