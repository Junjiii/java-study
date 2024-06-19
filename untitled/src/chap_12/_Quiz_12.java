package chap_12;

public class _Quiz_12 {
    public static void main(String[] args) {
        ReadyProduct readyProduct = new ReadyProduct();

        Runnable productA = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    readyProduct.ready("A", i);
                }
                System.out.println("-- A 상품 준비 완료 --");
            }
        };

        Runnable productB = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 5; i++) {
                    readyProduct.ready("B", i);
                }
                System.out.println("-- B 상품 준비 완료 --");
            }
        };

        Thread staff1 = new Thread(productA);
        Thread staff2 = new Thread(productB);
        staff1.start();
        staff2.start();

//        while (staff1.isAlive() || staff2.isAlive()) {
//
//        }

        try {
            staff1.join();
            staff2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Runnable packingSet = new Runnable() {
            @Override
            public void run() {
                System.out.println("== 세트 상품 포장 시작 ==");
                for (int i = 1; i <= 5; i++) {
                    System.out.println("세트 상품 포장 " + i + "/5");
                }
                System.out.println("== 세트 상품 포장 완료 ==");
            }
        };

        Thread packing = new Thread(packingSet);
        packing.start();

    }
}


class ReadyProduct {
    public static void ready(String product,int i) {
        System.out.println(product + " 상품 준비 " + i +"/5");
    }
}