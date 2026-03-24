package poly2.ex4;

public class AbstractMain {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAndMove(dog);
        soundAndMove(cat);
        soundAndMove(caw);
    }

    // 변하지 않는 부분
    private static void soundAndMove(AbastractAnimal animal) {
        System.out.println("테스트를 시작합니다.");
        animal.sound();
        animal.move();
        System.out.println("테스트를 종료합니다.");
    }
}
