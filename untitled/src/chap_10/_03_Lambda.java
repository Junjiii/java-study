package chap_10;

public class _03_Lambda {
    public static void main(String[] args) {
        // 람다식
        // (파라미터1, 파라미터2, .....) -> { 코드 }
        // 접근제어자,이름, 결과값 형태 (void) 3가지 다 필요없다.

    }
//    public void print() {
//        String s = "test";
//        System.out.println(s);
//    }

    // 람다식
//    () -> {
//        String s = "test";
//        System.out.println(s);
//    }


    // 파라미터를 받아 출력하는 메소드 예시
//    public void print(String s) {
//        System.out.println(s);
//    }

    // 람다식
//    (String s) -> { System.out.println(s)}; // 메소드의 이름이 생략 가능하다.
//    (s) -> { System.out.println(s)}; // 람다식은 결과값의 형태를 자동으로 알아내므로 String 을 생략가능하다.
//    (s) ->  System.out.println(s); // { 코드 } 이 부분이 한 줄이라면 {} 괄호도 생략 가능하다.
//    s ->  System.out.println(s); // 파라미터가 1개일 경우 () 소괄호도 생략 가능하다.

    // 전달값(결과값)이 있는 경우 예시
//    public int add(int x,int y) {
//        return x + y;
//    }

    // 람다
//    (x,y) -> { return x + y };  // return 이 있는 경우는 {} 괄호를 생략하지 못한다.
//    (x,y) -> x + y   // return 을 없애면 {} 괄호도 생략 가능하고 코드만 있어도 결과를 출력 가능하다.

}
