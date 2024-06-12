package chap_7;

public class _10_AccessModifier {
    public static void main(String[] args) {
        // 캡슐화 (Encapsulation) : 연관된 것들만 담는다.
        // 정보은닉 (Information hidding) : 올바르지 않는 정보가 영향을 주는 것을 막기 위함

        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근이 가능
        // default : (아무것도 적지 않았을뗴) 같은 패키지 내에서만 접근 가능
        // protected : 같은 패키지 내에서 , 다른 패키지인 경우 자식 클래스에서 접근 가능


        BlackboxRefurbish b1 = new BlackboxRefurbish();
        b1.setModelName("까망이");
        b1.setPrice(-5000);
        b1.setColor("Black");


        System.out.println("가격 : " + b1.getPrice() + "원");
        System.out.println("해상도 : " +  b1.getResolution());

    }
}
