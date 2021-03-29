package primeraParte;

public class Timer {

    private long startTime;
    private long stopTime;

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return stopTime - startTime;
    }
}
