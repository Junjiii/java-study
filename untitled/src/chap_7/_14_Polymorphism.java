package chap_7;

import chap_7.camera.Camera;
import chap_7.camera.FactoryCam;
import chap_7.camera.SpeedCam;


public class _14_Polymorphism {
    public static void main(String[] args) {
        // 다형성

        // class person : 사람
        // class Student  extends Person : 학생 (학생은 사람이다. Student is a person)
        // class Teacher  extends Person : 선생님 (선생님은 사람이다. Teacher is a person)

        Camera camera = new Camera();
        Camera speedCam = new SpeedCam();
        Camera factoryCam = new FactoryCam();


        camera.showMainFeature();
        speedCam.showMainFeature();
        factoryCam.showMainFeature();

        Camera[] cameras = new Camera[3];
        System.out.println( cameras );

        cameras[0] = new Camera();
        cameras[1] = new FactoryCam();
        cameras[2] = new SpeedCam();

        for(Camera cam: cameras ) {
            cam.showMainFeature();
        }

        System.out.println("-------------");
//        factoryCam.detectFire();
//        speedCam.checkSpeed();


        if(factoryCam instanceof FactoryCam) {
            ((FactoryCam) factoryCam).detectFire();
        }

        if(speedCam instanceof SpeedCam) {
            ((SpeedCam) speedCam).checkSpeed();
            ((SpeedCam) speedCam).recognizeLicensePlate();

        }

    }
}
