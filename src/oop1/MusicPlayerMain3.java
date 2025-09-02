package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("music on");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("music off");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume ++;
        System.out.println("volume = " + data.volume);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volume --;
        System.out.println("volume = " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("volume check");
        if (data.isOn) {
            System.out.println("music on, volume = " + data.volume);
        }else {
            System.out.println("music off");
        }
    }
}
