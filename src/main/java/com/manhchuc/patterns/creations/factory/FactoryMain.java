package com.manhchuc.patterns.creations.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Mobile ios = MobileFactory.getMobile("Ios", "2.4Ghz", "2048GB", "12MP", "FullHD");
        Mobile android = MobileFactory.getMobile("Android", "3.6Ghz", "4GB", "16MP", "2k");
        System.out.println(android.toString());
        System.out.println(ios.toString());
    }
}
