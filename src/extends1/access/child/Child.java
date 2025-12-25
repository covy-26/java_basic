package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1; // 외부 접근 모두 허용
        protectedValue = 1; // 패키지가 달라도 상속 관계이기에 접근 가능
        // defaultValue = 1; // 다른 패키지로 접근 불가
        // privateValue = 1; // 당연히 접근 불가

        publicMethod(); // 외부 접근 모두 허용
        protectedMethod(); // 패키지가 달라도 상속 관계이기에 접근 가능
        // defaultMethod(); // 다른 패키지로 접근 불가
        // privateMethod(); // 당연히 접근 불가

        printParent(); // 외부 접근 모두 허용
    }
}
