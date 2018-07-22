public class ProcessComeEmulator extends Thread {

    private ProcessQueue processQueue;


    public ProcessComeEmulator(ProcessQueue processQueue) {
        this.processQueue = processQueue;
    }


    @Override
    public void run() {

        int processId = 0;

        while (true) {

            System.out.println("process " + processId + " is coming...");
            System.out.println();

            Process process = new Process((processId++) + "", getRandomTime(), System.currentTimeMillis());
            processQueue.add(process);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


    private long getRandomTime() {
        return (long) (Math.random() * 3000);
    }
}
