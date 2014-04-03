package com.arturotena.benchmark;

public class Naive {
    public static void main(String... args) {
        int count = 100;
        long[] times = new long[count];
        int idx = 0;
        for (int i = 0; i < count; i++) {
            long t1 = System.currentTimeMillis();
            
            // do something
            
            long t2 = System.currentTimeMillis();
            times[idx++] = t2 - t1;
        }
        long sum = 0;
        for (long t : times) {
            sum += t;
        }
        double avg = (double)sum / count;
        System.out.println(avg + " ms");
    }
}
