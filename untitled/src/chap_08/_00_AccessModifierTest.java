package chap_08;

import chap_7.BlackboxRefurbish;
import chap_7.camera.Camera;
import chap_7.camera.FactoryCam;

public class _00_AccessModifierTest {
    public static void main(String[] args) {
        BlackboxRefurbish b1 = new BlackboxRefurbish();
        b1.modelName = "까망이"; // public
        // b1.resolution = "FHD"; // default
        // b1.price = 200000; // private
        // b1.color = "Black"; // protected


        Camera factoryCam = new FactoryCam();
        System.out.println(factoryCam.name);

    }
}
