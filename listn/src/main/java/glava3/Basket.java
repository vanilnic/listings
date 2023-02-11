package glava3;

class Basket {
    void pay(double money) {
        System.out.println("Оплачено наличными: " + money);
    }

    void pay(String cardNum) {
        System.out.println("Оплачено по кредитной карте #" + cardNum);
    }

    void pay(String accountNum, String bankCode) {
        System.out.println("Переведено на счет #" + accountNum + " в банке " + bankCode);
    }
}
    class BasketDemo{
        public static void main(String[] args) {
            Basket b1 = new Basket();
            Basket b2 = new Basket();
            Basket b3 = new Basket();

            System.out.println("b1: ");
            b1.pay(1200.0);
            System.out.println("b2: ");
            b2.pay("123456789");
            System.out.println("b3: ");
            b3.pay("987654321", "5500");
        }
    }

