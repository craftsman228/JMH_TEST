package com.jmh.benchmark.observer_xxx.external;

public class ExternalProfile {
    public String memebershipId;
    public String level;

    public ExternalProfile(String memebershipId, String level) {
        this.memebershipId = memebershipId;
        this.level = level;
    }

    public String getMemebershipId() {
        return memebershipId;
    }

    public void setMemebershipId(String memebershipId) {
        this.memebershipId = memebershipId;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
