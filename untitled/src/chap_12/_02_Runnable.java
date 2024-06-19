package chap_12;

import chap_12.clean.CleanRunnable;
import chap_12.clean.CleanThread;

public class _02_Runnable {
    public static void main(String[] args) {
        CleanRunnable cleanRunnable = new CleanRunnable();
        Thread thread = new Thread(cleanRunnable);
        thread.start();

        cleanByStaff1();

    }

    public static void cleanByStaff1() {
        System.out.println("--- 직원1 청소 시작 ---");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("직원1 " + i + "번방 청소 증 ");
        }
        System.out.println("--- 직원1 청소 끝 ---");
    }
}
