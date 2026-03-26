package poly.ex.pay1;

import static poly.ex.pay1.PayStore.findPay;

public class PayService {

    private Pay pay;

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        pay = findPay(option);

        boolean isSuccess = pay.pay(amount);

        if (isSuccess) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
