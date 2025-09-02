package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 총 개수를 입력하세요. : ");
        int n = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] productOrders = new ProductOrder[n];

        for (int i = 0; i < n; i++) {
            System.out.println(i+1 + "번 째 주문정보를 입력하세요.");
            System.out.print("상품명 : ");
            String productName = scanner.nextLine();

            System.out.print("가격: ");
            int price = scanner.nextInt();

            System.out.print("개수: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            productOrders[i] = createOrder(productName, price, quantity);
        }

        printOrders(productOrders);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;

        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }

        return totalAmount;
    }

    static void printOrders(ProductOrder[] productOrders) {

        int totalAmount = getTotalAmount(productOrders);

        for (ProductOrder productOrder : productOrders) {
            System.out.println("상품명 = " + productOrder.productName);
            System.out.println("가격 = " + productOrder.price + "원");
            System.out.println("개수 = " + productOrder.quantity + "개");
            System.out.println("---");
        }
        System.out.println("총 합계 금액: " + totalAmount + "원");
    }
}
