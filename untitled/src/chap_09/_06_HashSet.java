package chap_09;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class _06_HashSet {
    public static void main(String[] args) {
        // set 은 중복 X , 순서도 일정하지 않다.

        HashSet<String> set = new HashSet<>();

        set.add("삼겹살");
        set.add("쌈장");
        set.add("소금");
        set.add("삼겹살");
        set.add("고추");
        set.add("비빔면");

        System.out.println(set);

        // 삭제
        set.remove(0);
        if(set.contains("삼겹살")) {
            System.out.println("NOT FOUND 삼겹살");
        }

        // 전체 삭제
        set.clear();
        if(set.isEmpty()) {
            System.out.println("CLEAR");
        }


        // HashSet 사용을 하지만 입력한 일정한 순서가 필요하다면?
        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();

        set2.add(4);
        set2.add(10);
        set2.add(2);
        set2.add(4);
        set2.add(8);


        System.out.println(set2); // 4의 중복은 사라지고 입력한 순서대로 4, 10, 2, 8 로 되었다.
    }
}
