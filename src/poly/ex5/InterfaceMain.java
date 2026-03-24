package poly.ex5;

public class InterfaceMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAndMove(dog);
        soundAndMove(cat);
        soundAndMove(caw);
    }

    private static void soundAndMove(Animal animal) {
        System.out.println("테스트를 시작합니다.");
        animal.sound();
        animal.move();
        System.out.println("테스트를 종료합니다.");
    }
}
