package chap_7;

public class _08_Constructor {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox("까망이","FHD",200000,"Black");
        System.out.println(b1.modelName);
        System.out.println(b1.resolution);
        System.out.println(b1.price);
        System.out.println(b1.color);
        System.out.println(b1.serialNumber);


        Blackbox b2 = new Blackbox("하양이","UHD",160000,"White");
        System.out.println(b2.serialNumber);

    }
}
