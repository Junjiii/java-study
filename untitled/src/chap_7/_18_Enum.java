package chap_7;



public class _18_Enum {
    public static void main(String[] args) {
        Resolution resolution = Resolution.HD;
        System.out.println(resolution);

        resolution = Resolution.FHD;
        System.out.println(resolution);

        System.out.print("동영상 품질 : ");

        switch (resolution) {
            case HD :
                System.out.println("일반품질");
                break;
            case FHD :
                System.out.println("고화질");
                break;
            case UHD :
                System.out.println("초고화질");
                break;
        }

        resolution = Resolution.valueOf("UHD");
        System.out.println(resolution);

        for(Resolution myRes : resolution.values()) {
            System.out.println(myRes + " : " + myRes.ordinal());
        }

        System.out.println("--------------");
        for(Resolution myRes : resolution.values()) {
            System.out.println(myRes.name() + " : " + myRes.getWidth());
        }


    }
}

enum Resolution {
    HD(1280),FHD(1980),UHD(3840);

    private final int width;

    Resolution(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }
}
