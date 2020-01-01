package com.manhchuc.patterns.structures.adapter;

public class Mp3Player implements AudioPlayer{
    public void playSong() {
        System.out.println("Play song...");
    }

    public void recordingAudio() {
        System.out.println("Recording audio...");
    }
}
