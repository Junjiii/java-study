package chap_7;

public class _01_Class {
    public static void main(String[] args) {
        // 객체 지향 프로그래밍 (OOP : Objected-Oriented Programming)
        // 블랙박스
        Blackbox b1 = new Blackbox();
        // Blackbox 클래스로부터 b1 객체 생성
        // b1 객체는 blackbox 클래스의 인스턴스

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color = "Black";


        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

    }
}
