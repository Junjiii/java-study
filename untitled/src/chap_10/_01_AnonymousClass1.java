package chap_10;

public class _01_AnonymousClass1 {
    public static void main(String[] args) {
        // 익명 클래스 : 클래스 내부에서도 클래스를 만들어 사용 가능하다.
        Coffee c1 = new Coffee();
        c1.order("아메리카노");
        System.out.println("------------");

        Coffee specialCoffee = new Coffee() {
            @Override
            public void order(String coffee) {
                super.order(coffee);
                System.out.println("(귓속말) 케이크는 서비스 입니다.");
            } // specialCoffee 만을 위해 만든 일회성 class다. 다른 객체에서는 사용할 수 없다.

            @Override
            public void returnTray() {
                System.out.println("자리에 두시면 치워드릴게요");
            };
        };

        specialCoffee.order("Latte");

        System.out.println("--------------");
        c1.returnTray();
        specialCoffee.returnTray();


    }
}

class Coffee {
    public void order(String coffee) {
        System.out.println("주문하신 " + coffee + " 나왔습니다.");
    }

    public void returnTray() {
        System.out.println("커피 반납이 완료되었습니다.");
    }
}
