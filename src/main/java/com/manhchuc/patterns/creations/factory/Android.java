package com.manhchuc.patterns.creations.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Android extends Mobile {
    private String CPU;
    private String RAM;
    private String camera;
    private String screen;

    public String getCPU() {
        return CPU;
    }

    public String getRam() {
        return RAM;
    }

    public String getCamera() {
        return camera;
    }

    public String getScreen() {
        return screen;
    }

    public String getOS() {
        return "Android";
    }
}
