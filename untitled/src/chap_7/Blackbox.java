package chap_7;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class Blackbox {
    // Instance 변수
    // 서로 다른 객체에서 서로 다른 값들을 가진다.
    String modelName;
    String resolution;
    int price;
    String color;
    int serialNumber;
    static int counter;

    Blackbox() {
//        System.out.println("기본 생성자 호출");
//        this.serialNumber = ++counter;
//        System.out.println("시리얼 넘버를 발급 받았습니다.");
    }

    Blackbox(String modelName,String resolution, int price, String color) {
//        this();
//
//        System.out.println("사용자 정의 생성자 호출");
//        this.modelName = modelName;
//        this.resolution = resolution;
//        this.price = price;
//        this.color = color;
    }

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


    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if(showDateTime) {
            System.out.println("영상에 날짜정보가 표시됩니다.");
        }
        if(showSpeed) {
            System.out.println("영상에 속도가 표시됩니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 기록됩니다.");
    }

    void record() {
        record(true,true,5);
    }

    static void callServiceCenter() {
        System.out.println("서비스센터 1588-0000 으로 연결합니다.");
    }

    void appendModelName(String modelName) {
        this.modelName += modelName;
    }

    // Getter & Setter
    String getModelName() {
        return modelName;
    }
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    String getResolution() {
        if(resolution == null || resolution.isEmpty()) {
            return "판매자에게 문의하세요.";
        }
        return resolution;
    }

    void setResolution(String resolution) {
        this.resolution = resolution;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        if(price < 100000) {
            this.price = 100000;
        } else {
            this.price = price;
        }
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}
