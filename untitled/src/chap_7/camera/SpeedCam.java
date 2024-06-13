package chap_7.camera;

public class SpeedCam extends Camera{

    public SpeedCam() {
        this.name = "과속단속 카메라";
    }

    public void checkSpeed() {
        // 속도 체크
        System.out.println("속도를 측정합니다.");
    }

    public void recognizeLicensePlate(){
        // 번호 인식
        System.out.println("차량 번호를 인식합니다.");
    }
}
