package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.camera.SpeedCam;

public class _01_AbstractClass {
    public static void main(String[] args) {
        // 데이터 추상화
        // abstract
        // 추상 클래스 ( 아직 완성 되지않은 클래스 )
        // 추상 메소드 ( 추상 클래스에서만 사용 가능한 껍데기만 있는 메소드 / 추상 클래스 안에서 가질수도, 가지지 않을수도 있다.  )
        // 추상 클래스의 자기 클래스는 반드시 추상메소드를 완성해야 객체 생성 할 수 있다.


        // Camera camera = new Camera();   // 추상클래스이기 떄문에 객체를 만들 수 없다.
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.showMainFeature();

        SpeedCam speedCam = new SpeedCam();
        speedCam.showMainFeature();


    }
}
