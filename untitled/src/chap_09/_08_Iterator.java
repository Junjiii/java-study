package chap_09;


import java.util.*;

public class _08_Iterator {
    public static void main(String[] args) {
        // Iterator : Array 를 순회하는 메소드

        List<String> list = new ArrayList<>();
        // ArrayList<> 는 Class 로 AbstractList 라는 추상클래스를 상속받아 자식 관계이다.
        // ArrayList<> 는 List 라는 Interface 를 Implements 하여 List 의 메소드까지 사용 가능하다.

        list.add("James");
        list.add("(알 수 없음)");
        list.add("Curry");
        list.add("(알 수 없음)");
        list.add("Thompson");
        list.add("(알 수 없음)");
        list.add("Irving");
        list.add("(알 수 없음)");
        list.add("Green");
        list.add("(알 수 없음)");

        // 기본 순회
        Iterator<String> it = list.iterator();

        System.out.println(it.next()); // James

        // 순회할 다음 값이 있는 경우를 판단하는 메소드 true & false
        System.out.println(it.hasNext()); // true

        // 반복문을 통한 배열 끝까지 순회
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // (알 수 없음) 과 같이 잘못된 데이터를 삭제하는 메소드

        it = list.iterator();
        // next() 메소드를 통해 index 위치가 계속 움직이고 있었기 때문에
        // 처음으로 되돌려주기 위한 코드

        while (it.hasNext()) {
            String s = it.next();
            if(s.contains("(알 수 없음")) {
                it.remove();
            }
        }

        it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("------------");
        // Iterator 는 HashSet, HashMap 에서도 사용 가능하다.

        // HashSet
        HashSet<String> set = new HashSet<>();

        set.add("James");
        set.add("(알 수 없음)");
        set.add("Curry");
        set.add("(알 수 없음)");
        set.add("Thompson");
        set.add("(알 수 없음)");
        set.add("Irving");
        set.add("(알 수 없음)");
        set.add("Green");
        set.add("(알 수 없음)");


        System.out.println(set); // [Curry, James, (알 수 없음), Irving, Thompson, Green]

        Iterator<String> itSet = set.iterator();

        while (itSet.hasNext()) {
            String s = itSet.next();
            if(s.contains("(알 수 없음)")) {
                itSet.remove();
            }
        }

        System.out.println("---------");

        itSet = list.iterator();
        while (itSet.hasNext()) {
            System.out.println(itSet.next());
        }


        System.out.println("-------------");
        // HashMap

        HashMap<String,Integer> map = new HashMap<>();

        map.put("James",6);
        map.put("Curry",30);
        map.put("Irving",2);
        map.put("Thompson",11);
        map.put("Green",23);

        // map.iterator() 바로 사용 불가 : 형태가 Key, value 로 되어 있기 떄문
      Iterator<String> itMapKey = map.keySet().iterator();
        // Key
      while(itMapKey.hasNext()) {
          System.out.println(itMapKey.next());
      }
        // Value

        Iterator<Integer> itMapValue = map.values().iterator();
        while(itMapValue.hasNext()) {
            System.out.println(itMapValue.next());
        }

        // key & value 함께 출력

        Iterator<Map.Entry<String,Integer>> itMap = map.entrySet().stream().iterator();
        while(itMap.hasNext()) {
            System.out.println(itMap.next());
        }
    }
}
