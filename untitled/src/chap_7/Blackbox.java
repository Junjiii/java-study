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


}
