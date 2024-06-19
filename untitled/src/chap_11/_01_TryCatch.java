package chap_11;

public class _01_TryCatch {
    public static void main(String[] args) {
        // 예외처리
        // 컴파일 오류 (코드 자체에서 문제가 있는 경우),
        // 런타임 오류 (컴파일은 성공했으나 실행 과정에서 문제가 있는 경우)
        // 에러 (Error) : 작성하는 소스 코드를 통해서 수습할 수 없는 경우
        // ex) 메모리 부족으로 객체에 할당하지 못 하는 경우 out of memory error
        // ex stack of flow error
        // 예외 (Exception) : 작성하는 소스 코드를 통해서 수습할 수 있는 경우

        // 에러가 발생하면 프로그램이 올바르게 작동하지 못하고 중간에 종료되어버린다.
        // 그래서 예외처리를 통해 올바르게 정상 종료를 할 수 있게 설계한다.


        try {
//            System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 500;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (Exception e) {
            System.out.println("에러 발생 " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 정상 종료");
    }
}
