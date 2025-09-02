package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        RectangleProcedural rectangleProcedural = new RectangleProcedural(5, 8);
        System.out.println("넓이 = " + rectangleProcedural.calculateArea());
        System.out.println("둘레 길이 = " + rectangleProcedural.calculatePerimeter());
        System.out.println("정사각형 여부 = " + rectangleProcedural.isSquare());
    }
}
