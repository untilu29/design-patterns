package com.manhchuc.patterns.structures.adapter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdapterMain {
    public static void main(String[] args) throws IOException {
        SmartPhone smartPhone = new SmartPhone();
        AudioPlayer audioPlayer = new Mp3Player();
        AudioPlayer smartPhoneAdapter = new SmartPhoneAdapter(smartPhone);     //

        smartPhone.playMusic();
        smartPhone.playVideo();
        smartPhone.call();

        audioPlayer.playSong();
        smartPhoneAdapter.playSong();

        /**
         * Java implemented Adapter pattern
         *
         * java.util.Arrays#asList()
         * java.io.InputStreamReader(InputStream) (returns a Reader)
         * java.io.OutputStreamWriter(OutputStream) (returns a Writer)
         * javax.xml.bind.annotation.adapters.XmlAdapter#marshal() và #unmarshal()
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //
        System.out.print("Enter your name: ");
        String s = br.readLine();
    }
}
