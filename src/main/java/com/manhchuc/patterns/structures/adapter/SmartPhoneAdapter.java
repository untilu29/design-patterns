package com.manhchuc.patterns.structures.adapter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SmartPhoneAdapter implements AudioPlayer {
    private SmartPhone smartPhone;
    public void playSong() {
        smartPhone.playMusic();
    }
}
