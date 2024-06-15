package chap_08;

import chap_08.camera.FactoryCam;
import chap_08.detector.*;
import chap_08.reporter.*;

public class _02_Interface {
    public static void main(String[] args) {
        // 인터페이스
        // 이전에 배운 상속은 "단일 상속(extends)"만 가능했다. (부모를 하나만 가질 수 있다.)
        // 여러 곳에 나뉘어져있는 기능들을 사용하고 싶을때 인터페이스를 사용한다.

        Reportable normalReporter = new NormalReporter();
        normalReporter.report();

        Reportable videoReporter = new VideoReporter();
        videoReporter.report();


        Detectorable fireDetector = new FireDetector();
        fireDetector.detect();

        Detectorable advancedForeDetector = new AdvancedFireDetector();
        advancedForeDetector.detect();


        System.out.println("------------------");
        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(advancedForeDetector);
        factoryCam.setReporter(videoReporter);


        factoryCam.detect();
        factoryCam.report();
    }
}
