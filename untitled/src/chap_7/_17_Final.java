package chap_7;

import chap_7.camera.ActionCam;
import chap_7.camera.SlowActionCam;

public class _17_Final {
    public static void main(String[] args) {
        // final

        ActionCam actionCam = new ActionCam();
        // actionCam.lens = "표준렌즈";
        actionCam.recordVideo();
        actionCam.makeVideo();


        SlowActionCam slowActionCam = new SlowActionCam();
        slowActionCam.recordVideo();
        slowActionCam.makeVideo();

    }
}
