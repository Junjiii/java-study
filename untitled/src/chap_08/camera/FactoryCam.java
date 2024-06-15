package chap_08.camera;

import chap_08.detector.Detectorable;
import chap_08.reporter.Reportable;

public class FactoryCam extends Camera implements Detectorable, Reportable {
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
        System.out.println("화재 감지");
    }


    @Override
    public void detect() {
        detector.detect();
    }

    @Override
    public void report() {
        reporter.report();
    }
}

