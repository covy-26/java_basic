package oop1;

public class MusicPlayerMain2 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();


        data.isOn = true;
        System.out.println("music start");

        // volume up
        data.volume ++;
        System.out.println("volume = " + data.volume);

        // volume up
        data.volume ++;
        System.out.println("volume = " + data.volume);

        // volume down
        data.volume --;
        System.out.println("volume = " + data.volume);

        // status check
        System.out.println("volume check");
        if (data.isOn) {
            System.out.println("music ON, volume = " + data.volume);
        }else {
            System.out.println("music off");
        }

        System.out.println("music end");
    }
}
