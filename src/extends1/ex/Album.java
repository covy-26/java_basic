package extends1.ex;

public class Album extends Item{

    private String arthist;

    public Album(String name, int price, String arthist) {
        super(name, price);
        this.arthist = arthist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트: " + arthist);
    }
}
