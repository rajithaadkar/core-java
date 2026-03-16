class TV {

    static int minVolume = 0;
    static int maxVolume = 10;
    static int currentVolume;
    static boolean isTvOn;

    static void turnOn() {
        isTvOn = true;
        System.out.println("Smart TV is ON");
    }

    static void increaseVolume() {
        if(isTvOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the TV first");
        }
    }

    static void decreaseVolume() {
        if(isTvOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the TV first");
        }
    }
}