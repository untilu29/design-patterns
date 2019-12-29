package com.manhchuc.patterns.creations.factory;

public class MobileFactory {
    public static Mobile getMobile(String type, String CPU, String RAM, String camera, String screen) {
        if ("Ios".equals(type)) {
            return new Ios(CPU, RAM, camera, screen);
        } else if ("Android".equals(type)) {
            return new Android(CPU, RAM, camera, screen);
        }
        return null;
    }
}
