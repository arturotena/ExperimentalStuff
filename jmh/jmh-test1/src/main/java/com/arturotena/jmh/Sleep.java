package com.arturotena.jmh;

import org.openjdk.jmh.annotations.GenerateMicroBenchmark;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;

public class Sleep {

    @GenerateMicroBenchmark
    public void nothing() {
        // do nothing, to compare afterwards
    }

    @GenerateMicroBenchmark
    public void doSleep() throws InterruptedException {
        //Thread.sleep(100);
        Math.cos(3);
    }

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(".*" + Sleep.class.getSimpleName() + ".*")
                .build();

        new Runner(opt).run();
    }    
}
