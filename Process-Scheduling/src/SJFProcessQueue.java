import java.util.PriorityQueue;

public class SJFProcessQueue implements ProcessQueue {

    private PriorityQueue<Process> processesQueue = new PriorityQueue<>(
            (o1, o2) -> (int) (o1.getTotalTime() - o2.getTotalTime()));

    @Override
    public void add(Process process) {
        processesQueue.add(process);
    }

    @Override
    public Process get() {
        return processesQueue.poll();
    }

    @Override
    public boolean isEmpty() {
        return processesQueue.isEmpty();
    }
}
