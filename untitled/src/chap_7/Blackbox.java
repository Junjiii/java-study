package chap_7;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Blackbox {
    // Instance 변수
    // 서로 다른 객체에서 서로 다른 값들을 가진다.
    String modelName;
    String resolution;
    int price;
    String color;

    // class 변수 ( static 있는 변수 )
    // 해당 class 로부터 만들어지는 모든 객체에 동일하게 적용된다.
    static Boolean canAutoReport = false; // 자동신고 기능

    void autoReport() {
        if(canAutoReport) {
            System.out.println("충돌이 감지되어 자동으로 신고합니다.");
        } else {
            System.out.println("자동 신고 기능이 지원되지 않습니다.");
        }
    }

     void insertMemory(int capacity) {
        System.out.println("메모리가 삽입되었습니다.");
        System.out.println("용량은 " + capacity + "GB 입니다.");
    }

    int getVideoFileCount(int type) {
        if (type == 1 ) { // 일반영상
            return 9;
        } else if (type == 2){ // 이벤트 영상
            return 1;
        }
        return 10;
    }
}
