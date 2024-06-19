package chap_11;

public class _Quiz_11 {
    public static void main(String[] args) {
        int errorCode = 2;
        try{
            if(errorCode == 0) {
                System.out.println("상품 구매를 완료했습니다.");
            } else if(errorCode == 1) {
                throw new NotOnSaleException();
            } else if(errorCode == 2) {
                throw new SoldOutException();
            }
        } catch(NotOnSaleException e) {
            System.out.println(e.getMessage());
            System.out.println("상품 구매는 20시부터 가능합니다.");
        } catch (SoldOutException e) {
            System.out.println(e.getMessage());
            System.out.println("다음 기회에 이용해주세요");
        }
    }
}






class NotOnSaleException extends Exception {
    public NotOnSaleException() {
        super("상품 구매 가능 시간이 아닙니다.");
    }
}

class SoldOutException extends Exception {
    public SoldOutException() {
        super("해당 상품은 매진 되었습니다.");
    }
}