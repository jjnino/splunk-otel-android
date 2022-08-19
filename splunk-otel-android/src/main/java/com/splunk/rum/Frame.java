package com.splunk.rum;

public class Frame {
    Integer count = 1;
    Integer group = 0;
    String trace;

    public Frame(String trace) {
        this.trace = trace;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }
}
