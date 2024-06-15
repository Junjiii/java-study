package chap_08.camera;

import chap_08.detector.Detectorable;
import chap_08.reporter.Reportable;

public class SpeedCam extends Camera implements Detectorable, Reportable {
    private Detectorable detector;
    private Reportable reporter;

    public void setDetector(Detectorable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }

    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
    }

    public void detect() {
//        System.out.println("사고를 감지합니다.");
        detector.detect();
    }

    public void report() {
//        System.out.println("사고 신고를 진행합니다. ");
        reporter.report();
    }
}
