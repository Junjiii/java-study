package chap_7;

import chap_7.camera.Camera;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 (Primitive Data Types) int, float, double, boolean .....

        int[] i = new int[3];
        System.out.println(i[0]);


        // 참조 자료형 (Non-Primitive, Reference Data Types) : String , Camera, FactoryCam ......
        String[] string = new String[3];
        System.out.println(string[0]); // null


        Camera[] c = new Camera[3];
        System.out.println(c[0] == null); // true

        // 기본 자료형은 0 또는 0.0 과 같은 기본값을 가지고 있다.
        // 참조 자료형은 값을 지정해주지 않으면 null 로써 기본값을 가지지 않는다.
        // 기본 자료형은 메소드가 없으며 참조자료형은 메소드가 있다.
        // 기본 자료형은 이름이 소문자로 시작되고 참조 자료형은 대문자로 시작된다.


        System.out.println("----------------");
        int i1 = 10;
        int i2 = 20;
        System.out.println(i1);
        System.out.println(i2);
        i1 = i2;
        System.out.println(i1);
        System.out.println(i2);
        i1 = 10;
        System.out.println(i1);
        System.out.println(i2);
        // 기본 자료형은 별도로 움직인다.

        Camera c1 = new Camera();
        Camera c2 = new Camera();
        c1.name = "까망이";
        c2.name = "하양이";

        System.out.println(c1.name);
        System.out.println(c2.name);

        c1 = c2;
        System.out.println(c1.name);
        System.out.println(c2.name);
        // 참조 자료형은 참조하고 있는 방향이 함께 달라진다.
        changeName(c1);
        System.out.println(c1.name);
        System.out.println(c2.name);


    }

    public static void changeName(Camera camera) {
        camera.name = "잘못된 이름";
    }
}
