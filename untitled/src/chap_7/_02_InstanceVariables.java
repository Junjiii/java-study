package chap_7;

public class _02_InstanceVariables {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();

        b1.modelName = "까망이";
        b1.resolution = "FHD";
        b1.price = 200000;
        b1.color  = "Black";

        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);

        // 새로운 블랙박스 제품

        Blackbox b2 = new Blackbox();

        b2.modelName = "하양이";
        b2.resolution = "UHD";
        b2.price = 160000;
        b2.color = "White";


        System.out.println(b2.modelName);
        System.out.println(b2.resolution);
        System.out.println(b2.price);
        System.out.println(b2.color);



    }
}
