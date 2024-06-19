package chap_12.clean;

public class CleanRunnable implements Runnable{
    @Override
    public void run() {
            System.out.println("--- 직원2 청소 시작 (Runnable) --");
            for (int i = 1; i <= 10 ; i+=2) {
                System.out.println("직원2 " + i + "번방 청소 증 (Runnable)");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("--- 직원2 청소 끝 (Runnable) ---");
    }
}
