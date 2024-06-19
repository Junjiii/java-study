package chap_12;

import chap_12.clean.CleanThread;

public class _01_Thread {
    public static void main(String[] args) {
        // 쓰레드
        CleanThread cleanThread = new CleanThread();
        cleanThread.start();
        cleanByStaff2();
    }

    public static void cleanByStaff2() {
        System.out.println("--- 직원2 청소 시작  --");
        for (int i = 2; i <= 10 ; i+=2) {
            System.out.println("직원2 " + i + "번방 청소 증");
        }
        System.out.println("--- 직원2 청소 끝 ---");
    }

    public static void cleanByStaff1() {
        System.out.println("--- 직원1 청소 시작 (Thread) --");
        for (int i = 1; i <= 10 ; i+=2) {
            System.out.println("직원1 " + i + "번방 청소 증 (Thread)");
        }
        System.out.println("--- 직원1 청소 끝 (Thread) ---");
    }
}
