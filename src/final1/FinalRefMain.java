package final1;

public class FinalRefMain {

    public static void main(String[] args) {

        final Data data = new Data();
        // data = new Data(); // final 변경 불가 컴파일 오류 발생

        // 참조 대상의 변수는 변경 가능
        // value 는 final 이 아니기에 변경 가능
        data.value = 10;
        System.out.println(data.value);
        data.value = 20;
        System.out.println(data.value);
        data.value = 30;
        System.out.println(data.value);
    }
}
