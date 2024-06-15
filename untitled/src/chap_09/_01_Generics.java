package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스

        // 기본 자료형
//        int[] iArray = {1,2,3,4,5};
//        double[] dArray = {1.0,2.0,3.0,4.0,5.0};

        // 참조 자료형
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = {1.0,2.0,3.0,4.0,5.0};
        String[] sArray = {"A","B","C","D","E"};

//        printIntArray(iArray);
//        printDoubleArray(dArray);
//        printStringArray(sArray);

        System.out.println("--------------");
        // 제네릭스 문법은 참조 자료형만 가능하다
        printAnyArray(iArray);
        printAnyArray(dArray);
        printAnyArray(sArray);

    }

    private static <T> void printAnyArray(T[] array) {
        for(T t : array) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

    private static void printIntArray(int[] iArray) {
        for (int i : iArray) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDoubleArray(double[] dArray) {
        for (double d : dArray) {
            System.out.print(d + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
        for (String s : sArray) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
