package construct;

public class MemberThis {
    String nameField;

    // this. 생략되어 있으나, 항상 this.을 적는 코딩 스타일이 있음.
    void initMember(String nameParameter) {
//        this.nameField = nameParameter;
        nameField = nameParameter;
    }
}
