package chap_12;

import chap_12.clean.CleanRunnable;

public class _03_Join {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        try {
            thread.join(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        cleanByStaff1();
    }

    public static void cleanByStaff1() {
        System.out.println("--- 직원1 청소 시작 ---");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("직원1 " + i + "번방 청소 증 ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--- 직원1 청소 끝 ---");
    }
}
