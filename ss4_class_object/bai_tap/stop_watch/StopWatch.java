package ss4_class_object.bai_tap.stop_watch;

import java.time.LocalDate;
import java.time.LocalTime;

public class StopWatch {
    public LocalTime startTime;
    public LocalTime endTime;

    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.endTime = endTime;
        this.startTime = startTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public double getElapsedTime() {
        return (this.endTime.getMinute() * 60 + this.endTime.getSecond() + this.endTime.getNano() / 1000000) - (this.startTime.getMinute() * 60 + this.startTime.getSecond() + this.startTime.getNano() / 1000000);
    }
}

