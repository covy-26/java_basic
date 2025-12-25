package static2;

// import static static2.DecoData.staticCall;
// import static static2.DecoData.*;
public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall(); // import 를 통해 매번 클래스 명을 붙이는 것을 생략 할 수 있다.


        System.out.println("2. 인스턴스 호출 1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("2. 인스턴스 호출 2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // 인스턴스를 통한 접근
        DecoData data3 = new DecoData();
        DecoData.staticCall(); // 비권장: 인스턴스 메서드인가..?

        // 클래스를 통한 접근
        DecoData.staticCall(); // 권장: 정적 메서드 구나!
    }
}
