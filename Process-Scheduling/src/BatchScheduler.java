public class BatchScheduler extends Scheduler {
    public BatchScheduler(ProcessQueue processQueue) {
        super(processQueue);
    }

    @Override
    public void run() {
        while (true) {
            if (!processQueue.isEmpty()) {
                Process process = processQueue.get();
                process.run(process.getTotalTime());
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
