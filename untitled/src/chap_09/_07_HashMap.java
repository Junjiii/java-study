package chap_09;

import java.util.*;

public class _07_HashMap {
    public static void main(String[] args) {
        // map (key, value) 쌍으로 이루어진
        HashMap<String,Integer> map = new HashMap<>();

        map.put("James",6);
        map.put("Curry",30);
        map.put("Irving",2);

        System.out.println(map); // 결과값 {Curry=30, James=6, Irving=2}

        // 데이터 조회
        System.out.println(map.get("James"));

        // 포함여부
        if(map.containsKey("Curry")) {
            int backNum = map.get("Curry");
            System.out.println(++backNum);
        } else if (map.containsValue(30)) {
            System.out.println("value");
        }

        // 삭제
        map.remove("Curry");
        System.out.println(map.get("Curry")); // null

        // 전체 삭제
//        map.clear();

        System.out.println("--------------");
        // key 확인
        for(String key : map.keySet()) {
            System.out.println(key);
        }

        // value 확인
        for(int value : map.values()) {
            System.out.println(value);
        }

        // key & value 함께 확인
        for(String key : map.keySet()) {
            System.out.println(map.get(key));
        }

        // map : 중복 X , 순서 X
        map.put("Curry",30);
        map.put("Curry",40);
        map.put("Curry",50);

        System.out.println(map); // key 값 중복은 X , 그에 따른 value 는 가장 나중값을 적용




    }

    // value 를 넣어서 key 를 찾는 메소드는 없어서 따로 만들어서 사용하는 예제
    public static <K, V> K getKeyByValue(Map<K, V> map, V value) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
}
