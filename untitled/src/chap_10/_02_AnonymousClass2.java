package chap_10;

public class _02_AnonymousClass2 {
    public static void main(String[] args) {
        // 익명클래스
        // 같은 클래스에서 불러와 같은 메소드를 사용하는 경우 중
        // 상황마다 결과값이 달라야할때
        // abstract class 를 만들어 사용하려는 메소드에서 결과값을
        // 상황에 맞게 수정하여 그떄그때마다 불러와 사용할 수 있게 만든다.


        HomeMadeBurger momMadeBurger = getMomMadeBurger();
        momMadeBurger.cook();
        System.out.println("-------------");
        HomeMadeBurger broMadeBurger = getBroMadeBurger();
        broMadeBurger.cook();

    }

    public static HomeMadeBurger getBroMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 동생표 군대리아");
                System.out.println("재료 : 빵, 치킨패티, 치즈, 햄, 딸기잼");
            }
        };
    };

    public static HomeMadeBurger getMomMadeBurger() {
        return new HomeMadeBurger() {
            @Override
            public void cook() {
                System.out.println("집에서 만드는 엄마표 수제버거");
                System.out.println("재료 : 빵, 소고기패티, 해시브라운, 양상추");
            }
        };
    };
}

abstract class HomeMadeBurger {
    public abstract void cook();
}