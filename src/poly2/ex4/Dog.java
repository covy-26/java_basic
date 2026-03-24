package poly2.ex4;

public class Dog extends AbastractAnimal {
    @Override
    public void sound() {
        System.out.println("왈왈");
    }

    @Override
    public void move() {
        System.out.println("개가 움직입니다.");
    }
}
