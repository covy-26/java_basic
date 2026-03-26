package poly.ex.pay1;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        PayService payService = new PayService();
        Scanner sc = new Scanner(System.in);

        String option = "";
        int amount = 0;
        while (true) {
            System.out.print("결제수단을 입력하세요: ");
            option = sc.nextLine();
            if (option.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }
            System.out.print("결제금액을 입력하세요: ");
            amount = sc.nextInt();
            payService.processPay(option, amount);
        }


//        //kakao 결제
//        String payOption1 = "kakao";
//        int amount1 = 5000;
//        payService.processPay(payOption1, amount1);
//        //naver 결제
//        String payOption2 = "naver";
//        int amount2 = 10000;
//        payService.processPay(payOption2, amount2);
//        //newPay 결제
//        String payOption3 = "new";
//        int amount3 = 20000;
//        payService.processPay(payOption3, amount3);
//        //잘못된 결제 수단 선택
//        String payOption4 = "bad";
//        int amount4 = 15000;
//        payService.processPay(payOption4, amount4);
    }
}
