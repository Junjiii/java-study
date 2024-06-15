package chap_09;

import java.nio.channels.Channel;

public class _03_WrapperClass {
    public static void main(String[] args) {
        // 래퍼 클래스 (Wrapper)
        // int double float 과 같은 기본 자료형을 객체 형식으로 사용할 수 있게 만드는 방식이다.

        Integer i = 123;
        Double d = 2.0;
        Character c = 'A';

        System.out.println(i);
        System.out.println(d);
        System.out.println(c);


        System.out.println("-----------");

        System.out.println(i.intValue());
        System.out.println(d.intValue());
        System.out.println(c.charValue());

        System.out.println("-----------");

        String s = i.toString();
        System.out.println(s);
    }
}
