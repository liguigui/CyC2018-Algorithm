public class FCFSClient
{
    public static void main(String[] args)
    {
        ProcessQueue processQueue = new FCFSProcessQueue();
        ProcessComeEmulator processComeEmulator = new ProcessComeEmulator(processQueue);
        processComeEmulator.start();
        Scheduler scheduler = new BatchScheduler(processQueue);
        scheduler.start();
    }
}
