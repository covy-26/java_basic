package poly.ex5;

public class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("월월");
    }

    @Override
    public void move() {
        System.out.println("개가 이동");
    }
}
