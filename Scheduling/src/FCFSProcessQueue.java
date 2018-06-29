import java.util.LinkedList;
import java.util.Queue;

public class FCFSProcessQueue implements ProcessQueue
{
    private Queue<Process> queue = new LinkedList<>();

    @Override
    public void add(Process process)
    {
        queue.add(process);
    }

    @Override
    public Process get()
    {
        return queue.poll();
    }

    @Override
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
}
