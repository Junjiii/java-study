package chap_08.detector;

public class AccidentDetector implements Detectorable {
    @Override
    public void detect() {
        System.out.println("교통사고를 감지합니다.");
    }
}