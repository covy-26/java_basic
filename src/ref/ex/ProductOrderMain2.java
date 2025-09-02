package ref.ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createOrder("두부", 2000, 2);
        productOrders[1] = createOrder("김치", 5000, 1);
        productOrders[2] = createOrder("콜라", 1000, 3);

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
