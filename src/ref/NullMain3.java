package ref;

public class NullMain3 {
    public static void main(String[] args) {

        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        // NPE 발생 멤버변수 data가 초기화 돼있지 않음
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
