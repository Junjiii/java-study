package chap_7;

public class _03_ClassVariables {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";

        Blackbox b2 = new Blackbox();
        b2.modelName = "하양이";

        // 튿정 범위를 초과하는 충돌 감지 시 자동 신고 기능 개발 여부
        System.out.println(" - 개발 전 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + Blackbox.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + Blackbox.canAutoReport);
        // 클래스 변수는 모든 객체에 동일하게 적용되기 때문에 (클래스 이름).(변수 이름) 으로 호출 하는 것을 권장한다.

        // 기능 개발
        Blackbox.canAutoReport = true;
        System.out.println(" - 개발 후 - ");
        System.out.println(b1.modelName + " 자동 신고 기능 : " + Blackbox.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능 : " + Blackbox.canAutoReport);



    }
}
