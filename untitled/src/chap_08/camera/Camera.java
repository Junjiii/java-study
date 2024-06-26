package chap_08.camera;

public abstract class Camera {
    public void takePicture() {
        System.out.println("사진을 촬영합니다.");
    }

    public void recordVideo() {
        System.out.println("동영상을 녹화합니다.");
    }

    public abstract void showMainFeature(); // 자식 클래스에서 기능을 만들 수 있다.
}
