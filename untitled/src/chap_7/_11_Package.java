package chap_7;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 패키지)
        Random random = new Random();
        System.out.println("랜점 정수 : " + random.nextInt());
        System.out.println("랜덤 정수 (범위) : " + random.nextInt(10)); // 0 이상 10 미만
        System.out.println("랜덤 실수 : " + random.nextDouble()); // 0.0 이상 1.0 미만의 실수 (범위 지정 불가)

        // 만약 5.0 이상 10.0 미만의 실수를 뽑으려면? (범위 지정)
        double min = 5.0;
        double max = 10.0;
        System.out.println("랜덤 실수 (범위) : " + (min + (max-min) * random.nextDouble()));

        System.out.println("랜덤 boolean : " + random.nextBoolean() );
    }
}
