class IronBox {

    static int minHeat = 0;
    static int maxHeat = 5;
    static int currentHeat;
    static boolean isIronOn;

    static void turnOn() {
        isIronOn = true;
        System.out.println("Iron Box is ON");
    }

    static void increaseHeat() {
        if(isIronOn) {
            if(currentHeat < maxHeat) {
                currentHeat++;
                System.out.println("Heat Level : " + currentHeat);
            }
        } else {
            System.out.println("Turn ON the Iron Box first");
        }
    }

    static void decreaseHeat() {
        if(isIronOn) {
            if(currentHeat > minHeat) {
                currentHeat--;
                System.out.println("Heat Level : " + currentHeat);
            }
        } else {
            System.out.println("Turn ON the Iron Box first");
        }
    }
}