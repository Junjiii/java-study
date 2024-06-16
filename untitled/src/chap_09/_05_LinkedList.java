package chap_09;

import java.util.Collections;
import java.util.LinkedList;

public class _05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // 데이터 추가
        list.add("James");
        list.add("Curry");
        list.add("Durant");
        list.add("Russell");
        list.add("Luka");

        // 데이터 조회
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


        System.out.println("---------------------");

        // 추가
        // 맨 첫번쨰 index
        list.addFirst("Kobe");
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        // 맨 마지막 index
        list.addLast("Jordan");
        for(String s : list) {
            System.out.println(s);
        }

        System.out.println("---------------------");

        // 원하는 위치 추가
        list.add(list.size(),"Bird");
        System.out.println(list);


        // 삭제
        list.removeFirst(); // 첫번째 index 삭제
        list.removeLast(); // 마지막 index 삭제

        // 변경
        list.set(0,"Lenard");


        // 포함 여부
        if(list.contains("Curry")) {
            System.out.println(list);
        }

        // 전체 삭제
        list.clear();
        if(list.isEmpty()) {
            System.out.println("NOT FOUND ARRAY");
        }

        // 데이터 정렬
        list.add("James");
        list.add("Curry");
        list.add("Durant");
        list.add("Russell");
        list.add("Luka");

        Collections.sort(list);
        System.out.println(list);


    }
}
