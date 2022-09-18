public class TimingClass {
    private long startTime, endTime;

    public void startTime() {
        this.startTime = System.currentTimeMillis();
    }

    public String CalculateTime() {
        this.endTime = System.currentTimeMillis();
        return "Total time : "+(this.endTime-this.startTime)+"ms";
    }

}
