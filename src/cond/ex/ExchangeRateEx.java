package cond.ex;

public class ExchangeRateEx {
    public static void main(String[] args) {
        int rate = 1300;
        int dollar = 10;
        if (dollar < 0) {
            System.out.println("잘못된 금액입니다.");
        } else if (dollar == 0) {
            System.out.println("환전할 금액이 없습니다.");
        } else {
            System.out.println("환전 금액은 " + (dollar * rate) + "원입니다.");
        }
    }
}
