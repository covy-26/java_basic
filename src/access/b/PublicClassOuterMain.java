package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // default로 만든 내부 클래스는 다른 패키지에서 접근 불가
//        DefaultClass1 class1 = new Defaultclass1();
//        DefaultClass2 class1 = new Defaultclass2();
    }
}
