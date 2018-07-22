/**
 * 进程数据结构
 */
public class Process {

    private String name;
    private long totalTime;
    private long remainTime;
    private long comeInTime;


    public Process(String name, long totalTime, long comeInTime) {
        this.name = name;
        this.totalTime = totalTime;
        this.remainTime = totalTime;
        this.comeInTime = comeInTime;
    }


    public void run(long runTime) {

        System.out.println("process " + name + " is running...");
        System.out.println("come in time  : " + comeInTime);
        System.out.println("total time    : " + totalTime);
        System.out.println("remain time   : " + remainTime);
        System.out.println();

        remainTime -= runTime;
        try {
            Thread.sleep(runTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public long getTotalTime() {
        return totalTime;
    }


    public long getRemainTime() {
        return remainTime;
    }


    public long getComeInTime() {
        return comeInTime;
    }
}
