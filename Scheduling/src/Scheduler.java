public class Scheduler extends Thread {

    protected ProcessQueue processQueue;


    public Scheduler(ProcessQueue processQueue) {
        this.processQueue = processQueue;
    }
}
