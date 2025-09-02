package oop1;

public class ValueObjectMain {

    public static void main(String[] args) {
        ValueData valueData = new ValueData();
//        valueData.add();
//        valueData.add();
//        valueData.add();
        int addCnt = 3;

        for (int i=0; i<addCnt; i++){
            valueData.add();
        }

        System.out.println("최종 결과 value=" + valueData.value);
    }
}
