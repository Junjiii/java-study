package chap_11;

public class _03_Throw {
    public static void main(String[] args) {
        // 의도한 에러를 만드는 법
        int age = 17;
        try {
            if (age < 19) {
                System.out.println("19세 미만에게 판매하지 않습니다.");
                throw new Exception("미성년자 에러");
            } else {
                System.out.println("판매 완료");
            }
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
