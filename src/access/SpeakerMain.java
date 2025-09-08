package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();
        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // 100이상 넘으면 안되나, 다른 개발자가 수정하면서 200일 출력되버림.
        // => 다른 개발자가 봐도 접근이 안되도록 막자. (접근제어자의 필요)
        // speaker.volume = 200; // private 를 붙이니 컴파일 오류 발생.
        speaker.showVolume();

    }
}
