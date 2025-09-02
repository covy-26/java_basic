package oop1;

public class MusicPlayer {
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
        System.out.println("volume plus= " + volume);
    }

    void volumeDown() {
        volume --;
        System.out.println("volume minus= " + volume);
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
