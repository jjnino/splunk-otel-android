package com.splunk.rum;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class CrashReport {
    CrashException exception;
    ArrayList<CrashThread> threads;
    Boolean handled = false;
    Boolean ndkCrash = false;
    Boolean obfuscated = false;
    Long timestamp = new Date().getTime();
    UUID uuid = UUID.randomUUID();

    public CrashReport(CrashException exception, ArrayList<CrashThread> threads) {
        this.exception = exception;
        this.threads = threads;
    }

    public CrashException getException() {
        return exception;
    }

    public void setException(CrashException exception) {
        this.exception = exception;
    }

    public Boolean getHandled() {
        return handled;
    }

    public void setHandled(Boolean handled) {
        this.handled = handled;
    }

    public Boolean getNdkCrash() {
        return ndkCrash;
    }

    public void setNdkCrash(Boolean ndkCrash) {
        this.ndkCrash = ndkCrash;
    }

    public Boolean getObfuscated() {
        return obfuscated;
    }

    public void setObfuscated(Boolean obfuscated) {
        this.obfuscated = obfuscated;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }
}
