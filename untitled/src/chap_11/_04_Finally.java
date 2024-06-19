package chap_11;

public class _04_Finally {
    public static void main(String[] args) {
        // finally

        try {
            System.out.println("택시 문을 연다.");
//            throw new Exception("휴무택시");
        } catch (Exception e) {
            System.out.println("문제 발생 : " + e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("택시 문을 닫는다.");
        }

        // try + catch(s)
        // try + catch(s) + finally
        // try + finally
    }
}
