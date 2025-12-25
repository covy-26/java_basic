package access.ex;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;
    private int max;

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.max = 10;
    }

    public void addItem(Item item) {
        int nowCount = 0;

        for (Item nowItem : items) {
            nowCount += nowItem.getCount();
        }

        if (nowCount + item.getCount() > max){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total = 0;

        for (Item item : items) {
            int sum = item.getCount() * item.getPrice();
            System.out.println("상품명: " + item.getName() + ", 합계: " + sum);
            total += sum;
        }

        System.out.println("전체 가격 합: " + total);
    }
}
