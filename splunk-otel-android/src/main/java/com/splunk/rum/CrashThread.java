package com.splunk.rum;

import java.util.ArrayList;

public class CrashThread {
    Boolean crashed;
    String name;
    ArrayList<Frame> frames;

    public Boolean getCrashed() {
        return crashed;
    }

    public void setCrashed(Boolean crashed) {
        this.crashed = crashed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Frame> getFrames() {
        return frames;
    }

    public void setFrames(ArrayList<Frame> frames) {
        this.frames = frames;
    }

    public CrashThread(Boolean crashed, String name, ArrayList<Frame> frames) {
        this.crashed = crashed;
        this.name = name;
        this.frames = frames;
    }
}
