package ss4_class_object.bai_tap.stop_watch;

import java.time.LocalTime;

public class MainWatch {
    public static void main(String[] args) {
        LocalTime startTime = LocalTime.now();
        System.out.println(startTime);
        for (int j = 0; j < 1000; j++) {
            int[] data = {-2, 45, 0, 11, -9};
            for (int i = 0; i < (data.length - 1); i++) {
                boolean swapped = false;
                for (int z = 0; z < (data.length - i - 1); z++) {
                    if (data[z] > data[z + 1]) {
                        int temp = data[z];
                        data[z] = data[z + 1];
                        data[z + 1] = temp;
                        swapped = true;
                    }
                }
                if (!swapped)
                    break;

            }
        }
        LocalTime endTime = LocalTime.now();
        StopWatch watch = new StopWatch(startTime, endTime);
        System.out.println(watch.getEndTime());
        System.out.println("loading :" + watch.getElapsedTime() + "  ms");
    }
}