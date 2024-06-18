package chap_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _04_ArrayList {
    public static void main(String[] args) {
        // 컬렉션 프레임워크 (List , Set , Map)
        // 기존 배열 만드는 방법
//        int[] array = new int[3];
//        array[0] = 1;
//        array[1] = 2;
//        array[2] = 3;

        List<String> list = new ArrayList<>();

        // 데이터 추가
        list.add("유재석");
        list.add("조세호");
        list.add("김종국");
        list.add("박명수");
        list.add("강호동");
//        list = Arrays.asList("유재석","조세호","김종국","박명수","강호동");

        System.out.println(list);

        // 데이터 조회
        System.out.println(list.get(0)); // index 를 이용한 조회
        System.out.println("------------");

        // 데이터 삭제
        list.remove("박명수"); // 데이터 값을 활용한 삭제
        // list.remove(3); // index 를 활용한 삭제
        System.out.println(list);
        System.out.println(list.size()); // 배열의 길이

        System.out.println("------------");

        list.remove(list.size() - 1); // 배열의 맨 마지막 index를 지우는 법
        System.out.println(list);

        for(String s : list) {
            System.out.println(s);
        }



        System.out.println("------------");
        // 데이터 변경
        list.set(0,"이광수"); // index 위치 , 변경할 값
        System.out.println(list.get(0 ));


        // 인덱스 위치 알아내기
        System.out.println(list.indexOf("이광수"));

        // 해당 값의 포함 여부 true , false
        if(list.contains("김종국")) {
            System.out.println("해당하는 index 는 : " + list.indexOf("김종국"));
        } else {
            System.out.println("정보가 틀림");
        }

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("배열이 비어있습니다.");
        };


        // 배열 정렬
        list.add("A");
        list.add("G");
        list.add("Z");
        list.add("B");
        list.add("D");

        Collections.sort(list);

        System.out.println(list);


    }
}
