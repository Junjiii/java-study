package chap_7;

public class _05_Overloading {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";

        b1.record(false,false,10);
        System.out.println("--------------------");
        b1.record();
    }
}
