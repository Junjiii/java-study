package chap_11;

import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;

public class _05_TryWithResources {
    public static void main(String[] args) {
        MyFileWriter writer1 = null;

        try {
            writer1 = new MyFileWriter();
            writer1.write("java 공부 내용");
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                writer1.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println("----------------");
        // AutoClosealbe 을 상속하면 try 옆에 () 안에 상속된 class 를 객체생성하면
        // 따로 close() 메소드를 작성하지 않아도 자동으로 실행된다.

        try(MyFileWriter writer2 = new MyFileWriter()) {
            writer2.write("javascript 공부 내용");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("파일을 정상적으로 닫습니다.");
    }

    public void write(String line) {
        System.out.println("파일에 내용을 입력합니다.");
        System.out.println("입력내용 : " + line);
    }
}
