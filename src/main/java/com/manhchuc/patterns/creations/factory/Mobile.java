package com.manhchuc.patterns.creations.factory;

public abstract class Mobile {
    public abstract String getCPU();

    public abstract String getRam();

    public abstract String getCamera();

    public abstract String getScreen();

    @Override
    public String toString() {
        return "CPU=" + getCPU() + ", RAM=" + getRam() + ", Camera=" + getCamera() + ", Screen=" + getScreen();
    }
}
