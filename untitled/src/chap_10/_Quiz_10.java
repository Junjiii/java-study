package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _Quiz_10 {
    public static void main(String[] args) {
        List<Customer> customerInformation = new ArrayList<>();
        customerInformation.add(new Customer("챈들러",50));
        customerInformation.add(new Customer("레이첼",42));
        customerInformation.add(new Customer("모니카",21));
        customerInformation.add(new Customer("벤자민",18));
        customerInformation.add( new Customer("제임스",5));


        Stream<Customer> informationStream = customerInformation.stream();

        System.out.println("미술관 입장료");
        System.out.println("----------------------");
        informationStream.
                map(x -> x.age >= 20 ? x.name + " 5000원" : x.name + " 무료").
                forEach(System.out::println);

//         informationStream.forEach(x -> admissionFee(x));
    }

    public static void admissionFee(Customer personalInformation) {
        if(personalInformation.age >= 20) {
            System.out.println(personalInformation.name + " 5000원");
        } else {
            System.out.println(personalInformation.name + " 무료");
        }
    }
}

class Customer {
    public String name;
    public int age;

    public Customer( String name,int age) {
        this.age = age;
        this.name = name;
    }
}
