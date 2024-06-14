package chap_7;

import chap_7.camera.Camera;
import chap_7.camera.FactoryCam;

public class _15_Super {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Camera factoryCam = new FactoryCam();
        System.out.println(camera.name);
        System.out.println(factoryCam.name);

    }
}
