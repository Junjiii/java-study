package chap_7.camera;



public class FactoryCam extends Camera {
    public FactoryCam() {
        this.name = "공장 카메라";
    }

    public void detectFire() {
        // 화대 감지
        System.out.println("화재를 감지합니다.");
    }
}
