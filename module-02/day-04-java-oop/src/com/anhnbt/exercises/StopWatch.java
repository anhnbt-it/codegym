package com.anhnbt.exercises;

import java.util.Calendar;
import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;
    private final Calendar calendar;

    public StopWatch() {
        calendar = Calendar.getInstance();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        int[] myArrays = {36509, 66642, 94149, 7009, 58043, 39980, 88707, 93753, 82550, 92608, 76978, 56076, 9157, 85546, 63717, 51370, 67081, 52342, 70529, 13922, 59269, 3793};
        System.out.println("Time in milliseconds: " + stopWatch.getElapsedTime());
        System.out.println("Mang dau vao");
        stopWatch.displayArray(myArrays);
        stopWatch.start();
        System.out.println("Star: " + stopWatch.getStartTime());
        stopWatch.selectionSort(myArrays);
        stopWatch.stop();
        System.out.println("Stop: " + stopWatch.getEndTime());
        System.out.println("Elapsed Time: " + stopWatch.getElapsedTime());
        System.out.println("Mang sau khi sap xep");
        stopWatch.displayArray(myArrays);
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = calendar.getTime();
    }

    public void stop() {
        this.endTime = calendar.getTime();
    }

    public long getElapsedTime() {
        return calendar.getTimeInMillis();
    }

    public void selectionSort(int[] arr) {
        int indexMin, i, j;

        // lap qua tat ca cac phan tu
        for (i = 0; i < arr.length-1; i++) {
            // goi phan tu dau tien la min
            indexMin = i;

            for (j = (i + 1); j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }
            }

            if (indexMin != i) {
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public void displayArray(int[] arr) {
        System.out.print("[");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}
