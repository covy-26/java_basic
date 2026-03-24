package poly.ex6;

public class SoundFlyMain {

    public static void main(String[] args) {
        Bird bird = new Bird();
        Chicken chicken = new Chicken();
        Dog dog = new Dog();

        sound(bird);
        sound(chicken);
        sound(dog);

        fly(bird);
        fly(chicken);
    }

    private static void sound(Animal animal) {
        System.out.println("sound test 시작합니다.");
        animal.sound();
        System.out.println("sound test 종료합니다.");
    }

    private static void fly(Fly fly) {
        System.out.println("fly test 시작합니다.");
        fly.fly();
        System.out.println("fly test 종료합니다.");
    }
}
