package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림
        // 원하는 데이터를 뽑아내거나 필터링하거나 등등의 작업을 할 수 있다.

        // Arrays.stream()
        int[] scores = {100,95,90,85,80};
        IntStream scoreStream = Arrays.stream(scores);


        String[] langs = {"python","java","javascript","c","c++"};
        Stream<String> langStream = Arrays.stream(langs);



        // Collection.stream()
        List<String> langList = new ArrayList<>();
//        langList.add("python");
//        langList.add("java");
//        langList.add("javascript");
//        langList.add("c");
//        langList.add("c++");
        langList = Arrays.asList("python","java","javascript","c","c++");
        System.out.println(langList);
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("python", "java", "javascript", "c", "c++");


        // 스트림 사용법
        // 중간연산 (Intermediate Operation) : 여러 필터링 작업을 갯수 제한 없아 하는 과정
        // filter , map , sorted , distinct , skip , ....
        // 한 번 사용된 stream 은 횟수만큼 데이터가 소진된다.( 원본 데이터가 사라지지 않는다.)


        // 최종연산 (Terminal Operation) : 중간연산을 통해 걸러진 최종결과물 한번만 사용함
        // count ,  min , max , sum , forEach , anyMatch, allMatch .......

        // 출력 forEach()
       Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
       // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println); // 동일한 결과값
        System.out.println("-------------");

        // 걸러진 데이터 카운트 count()
        long count = Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("-------------");


        // 합 sum()
        int sum = Arrays.stream(scores).filter(x-> x>= 90).sum();
        System.out.println(sum);
        System.out.println("-------------");

        // 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("-------------");


        // "python","java","javascript","c","c++"   문자열 스트림
        // c 로 시작하는 이름
        Arrays.stream(langs).filter(x -> x.startsWith("c")).forEach(System.out::println);
        System.out.println("-------------");

        // java 를 포함하는 이름
        Arrays.stream(langs).filter(x -> x.contains("java")).forEach(System.out::println);
        System.out.println("-------------");

//        Arrays.stream(langs).filter(x -> x.length() <= 4).sorted().forEach(System.out::println);

        // 4글자 이하인 이름 (ArrayList)
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("-------------");

        // 4글자 이하인 이름 중 c 를 포함하는 이름
        langList.stream().filter(x -> x.length() <= 4).filter(x -> x.contains("c")).sorted().forEach(System.out::println);
        // langList.stream().filter(x -> x.length() <= 4 && x.contains("c")).sorted().forEach(System.out::println);
        System.out.println("-------------");

        // 4글자 이하 이름 중 c 라는 단어를 포함하는 이름이 하나라도 있는지 여부 anyMatch
        boolean anyMatch = langList.stream().
                filter(x -> x.length() <= 4).
                anyMatch(x -> x.contains("c"));
        System.out.println(anyMatch);

        // 4글자 이하 이름 중 c 라는 단어를 포함하는 이름이 모두 있는지 여부 allMatch
        boolean allMatch = langList.stream().
                filter(x -> x.length() <= 4).
                allMatch(x -> x.contains("c"));
        System.out.println(allMatch);

        System.out.println("----------");
        // 4글자 이하 이름 중 c 라는 단어를 포함하는 이름 뒤에 (어려워요) 라는 단어을 붙이기
        // map
        langList.stream().
                filter(x -> x.length() <= 4).
                filter(x -> x.contains("c")).
                map(x -> x + "(어려워요)").
                forEach(System.out::println);

        System.out.println("----------");
        //  c 라는 단어를 포함하는 이름 대문자로 출력
        langList.stream().
                filter(x -> x.contains("c")).
                map(String::toUpperCase).
                forEach(System.out::println);

        System.out.println("----------");
        // 걸러진 데이터를 다른 리스트에 저장하는 법 
        List<String> langListStartWithC = langList.stream().
                filter(x -> x.contains("c")).
                map(String::toUpperCase).
                collect(Collectors.toList());

        langListStartWithC.stream().forEach(System.out::println);

    }
}
