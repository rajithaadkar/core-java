class SmartWatch {

    static int minBrightness = 0;
    static int maxBrightness = 10;
    static int currentBrightness;
    static boolean isWatchOn;

    static void turnOn() {
        isWatchOn = true;
        System.out.println("SmartWatch is ON");
    }

    static void increaseBrightness() {
        if(isWatchOn) {
            if(currentBrightness < maxBrightness) {
                currentBrightness++;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the SmartWatch first");
        }
    }

    static void decreaseBrightness() {
        if(isWatchOn) {
            if(currentBrightness > minBrightness) {
                currentBrightness--;
                System.out.println("Brightness : " + currentBrightness);
            }
        } else {
            System.out.println("Turn ON the SmartWatch first");
        }
    }
}