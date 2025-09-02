package oop1;

public class MusicPlayerMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        isOn = true;
        System.out.println("music start");

        // volume up
        volume ++;
        System.out.println("volume = " + volume);

        // volume up
        volume ++;
        System.out.println("volume = " + volume);

        // volume down
        volume --;
        System.out.println("volume = " + volume);

        // status check
        System.out.println("volume check");
        if (isOn) {
            System.out.println("music ON, volume = " + volume);
        }else {
            System.out.println("music off");
        }

        System.out.println("music end");
    }
}
