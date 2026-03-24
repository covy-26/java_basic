package poly.Diamond;

public class DiamondMain {

    public static void main(String[] args) {

        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();
        // 근데 왜 a는 methodB()를 쓸 수 없는가?

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();


    }
}
