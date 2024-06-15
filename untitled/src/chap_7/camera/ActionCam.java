package chap_7.camera;

public class ActionCam extends Camera {
    public final String lens;
    public ActionCam() {
        super("액션 카메라");
        lens = "광각 카메라";
    }

    public void makeVideo() {
        System.out.println(this.name + " : " + this.lens + "로 멋진 비디오를 제작합니다. ");
    }
}
