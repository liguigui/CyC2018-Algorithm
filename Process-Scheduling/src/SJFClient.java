public class SJFClient {
    public static void main(String[] args) {
        ProcessQueue processQueue = new SJFProcessQueue();
        ProcessComeEmulator processComeEmulator = new ProcessComeEmulator(processQueue);
        processComeEmulator.start();
        Scheduler scheduler = new BatchScheduler(processQueue);
        scheduler.start();
    }
}
