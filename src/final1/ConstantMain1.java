package final1;

public class ConstantMain1 {

    public static void main(String[] args) {
//        System.out.println("프로그램 최대 참여자 수" + 1000); // 매직넘버, 유지보수 불리
        System.out.println("프로그램 최대 참여자 수" + Constant.MAX_USERS); // 상수 사용
        int currentUserCount = 999;

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);

//        if (currentUserCount > 1000) { // 매직넘버, 유지보수 불리
        if (currentUserCount > Constant.MAX_USERS) { // 상수 사용
            System.out.println("대기자로 등록");
        } else {
            System.out.println("게임에 참여");
        }
    }
}
