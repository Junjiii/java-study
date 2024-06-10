package chap_7;

public class _04_Method {
    public static void main(String[] args) {
        Blackbox b1 = new Blackbox();
        b1.modelName = "까망이";

        b1.autoReport(); // 지원 안됨
        Blackbox.canAutoReport = true;
        b1.autoReport(); // 지원 됨

        b1.insertMemory(256);

        // 일반 엿상 : 1
        // 이벤트 영상 : 2 (충동 감지)
        int fileCount = b1.getVideoFileCount(1); // 일반영상
        System.out.println("일반 영상 파일 수 " + fileCount);
        fileCount = b1.getVideoFileCount(2); // 이벤트 영상
        System.out.println("이벤트 영상 파일 수 " + fileCount);
        fileCount = b1.getVideoFileCount(3);
        System.out.println("모든 파일 수 " + fileCount);

    }
}
