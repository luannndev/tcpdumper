package dev.luan.tcp;

import dev.luan.tcp.config.Config;

import java.time.format.DateTimeFormatter;

public class TCPDumper {

    private Config config;
    private int triggerScale;
    private long lastTrigger;
    private DateTimeFormatter dateTimeFormatter;


    public TCPDumper() {
        this.lastTrigger = 0;
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
        this.startProcess();
    }

    private void startProcess() {

    }

    public Config getConfig() {
        return config;
    }
}
