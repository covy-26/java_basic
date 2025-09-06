package pack;

import pack.a.*;


public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        User user = new User();
        User2 user2 = new User2();
        pack.b.User user1 = new pack.b.User(); // 같은 이름의 클래스는 하나만 import 가능
    }
}
