package chap_7;

public class _Quiz_07 {
    public static void main(String[] args) {
        Hamburger[] hamburgers = new Hamburger[3];

        hamburgers[0] = new Hamburger();
        hamburgers[1] = new CheeseBurger();
        hamburgers[2] = new ShrimpBurger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("----------");

        for(Hamburger hamburger : hamburgers) {
            hamburger.cook();
            System.out.println("-------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");

    }
}


class Hamburger {
    public String name;

    Hamburger() {
        this("햄버거");
    }

    Hamburger(String name) {
        this.name = name;
    }

    public void cook() {
        Ingredient ingredient = Ingredient.ingredient1;
        System.out.println(this.name + "를 만듭니다.");
        System.out.println("빵 사이에 들어간 재료는?");

        for(Ingredient ingre : ingredient.values()){
            System.out.println(ingre.getIngredient());
        }

    }
}


enum Ingredient {
    ingredient1("> 양상추"), ingredient2("+ 패티"), ingredient3("+ 피클");

    public final String ingredient;
    Ingredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }
}

class CheeseBurger extends Hamburger {
    CheeseBurger() {
        super("치즈햄버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 치즈");
    }
}

class ShrimpBurger extends Hamburger {
    ShrimpBurger() {
        super("새우버거");
    }

    @Override
    public void cook() {
        super.cook();
        System.out.println("+ 새우");
    }
}