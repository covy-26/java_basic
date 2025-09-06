package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    //추가 -> 생성자 오버로딩
    MemberConstruct(String name, int age) {
//        this.name = name; // 아래 생성자와 동일 코드
//        this.age = age; // 아래 생성자와 동일 코드
//        this.grade = 50;

        // 동일 코드 개선
        this(name, age, 50);
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name+", age=" +age+", grade=" + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
