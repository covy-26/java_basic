package oop1;

public class MusicPlayerData {

    int volume;
    boolean isOn;


    void on() {
        this.isOn = true;
        System.out.println("music on");
    }

    void off() {
        isOn = false;
        System.out.println("music off");
    }

    void volumeUp() {
        volume ++;
        System.out.println("volume = " + volume);
    }

    void volumeDown() {
        volume --;
        System.out.println("volume = " + volume);
    }

    void showStatus() {
        System.out.println("volume check");
        if (isOn) {
            System.out.println("music on, volume = " + volume);
        }else {
            System.out.println("music off");
        }
    }
}
