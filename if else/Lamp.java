class Lamp {

    static int minBrightness = 0;
    static int maxBrightness = 10;
    static int currentBrightness;
    static boolean isLampOn;

    static void turnOn() {
        isLampOn = true;
        System.out.println("Smart Lamp is ON");
    }

    static void increaseBrightness() {
        if(isLampOn) {
            if(currentBrightness < maxBrightness) {
                currentBrightness++;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Lamp first");
        }
    }

    static void decreaseBrightness() {
        if(isLampOn) {
            if(currentBrightness > minBrightness) {
                currentBrightness--;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the Lamp first");
        }
    }
}