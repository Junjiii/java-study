package chap_09.coffee;

public class Coffee <T>{
    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("주문 고객 이름 : " + name);
    }
}
