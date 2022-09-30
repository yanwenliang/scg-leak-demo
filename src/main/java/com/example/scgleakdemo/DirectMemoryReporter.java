package com.example.scgleakdemo;

import static org.slf4j.LoggerFactory.getLogger;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;

import io.netty.util.internal.PlatformDependent;

public class DirectMemoryReporter {
    private static final Logger log = getLogger(DirectMemoryReporter.class);
    private static final ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

    public static void startReport() {
        executor.scheduleAtFixedRate(
                () -> log.info("netty direct memory size:{}b, max:{}", PlatformDependent.usedDirectMemory(),
                        PlatformDependent.maxDirectMemory()), 1, 7, TimeUnit.SECONDS);
    }
}