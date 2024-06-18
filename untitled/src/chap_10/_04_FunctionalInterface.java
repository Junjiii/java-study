package chap_10;

import chap_10.converter.*;

public class _04_FunctionalInterface {
    public static void main(String[] args) {
        KRWConverter converter = new KRWConverter();
//        converter.convert(1);

//        convertUSD(converter,2);

        // 람다식
        // convertUSD((USD) ->  System.out.println(USD + " 달러 = " + (USD * 1400) + " 원"),2);

        // 함수형 인터페이스
        Convertable convertible = (USD) ->  System.out.println(USD + " 달러 = " + (USD * 1400) + " 원");
        convertUSD(convertible,2);

        // 전달값이 하나도 없다면?
        ConvertableWithNoParams  c1 = () -> System.out.println("1달러는 140원");
        c1.convert();

        // 두 줄 이상의 코드가 있다면?
        c1 = () -> {
          int USD = 5;
          int KRW = 1400;
            System.out.println(USD + " 달러 = " + (USD * KRW) + " 원");
        };
        c1.convert();


        // 전달값이 2개라면?
        ConvertableWithTwoParams c2 = (d,w) -> {
            System.out.println(d + " 달러 = " + (d * w) + " 원");
        };
        c2.convert(4,10);

        // 빈환값이 있는경우
        ConvertableWithReturn c3 = (d,w) -> d * w;
        int result = c3.convert(4,1600);
        System.out.println(result);
    }

    public static void convertUSD(Convertable converter,  int USD) {
        converter.convert(USD);
    }


}
