package com.splunk.rum;

import java.util.ArrayList;

public class CrashException {
    ArrayList<Frame> frames;
    String name;
    String reason;

    public CrashException(ArrayList<Frame> frames, String name, String reason) {
        this.frames = frames;
        this.name = name;
        this.reason = reason;
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<Frame> frames) {
        this.frames = frames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
