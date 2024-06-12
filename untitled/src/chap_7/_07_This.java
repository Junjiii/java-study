package chap_7;

public class _07_This {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";
        String newName = "(최신형)";
        b1.appendModelName(newName);
        System.out.println(b1.modelName);
    }
}
