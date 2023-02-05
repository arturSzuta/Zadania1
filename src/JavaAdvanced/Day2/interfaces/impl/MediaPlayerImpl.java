package JavaAdvanced.Day2.interfaces.impl;

import JavaAdvanced.Day2.interfaces.MediaPlayer;

public class MediaPlayerImpl implements MediaPlayer {
    public static void main(String[] args) {

    }

    @Override
    public void stop() {
        System.out.println("STOP implementation in class");
    }
    private String name = "Interface implementation";

    public String getName(){
        return name;
    }
}
