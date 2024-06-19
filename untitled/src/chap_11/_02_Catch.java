package chap_11;

public class _02_Catch {
    public static void main(String[] args) {
        try {
//            System.out.println(3 / 0);
//            int[] arr = new int[3];
//            arr[5] = 500;

            Object obj = "test";
            System.out.println((int) obj);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("에러 1");
        } catch (ClassCastException e ){
            System.out.println("에러 2");
        } catch (Exception e) {
            System.out.println("에러 발생 " + e.getMessage());
            e.printStackTrace();
        }
    }
}
