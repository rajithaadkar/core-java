class Heater {

    static int minTemp = 18;
    static int maxTemp = 30;
    static int currentTemp = 22;
    static boolean isHeaterOn;

    static void turnOn() {
        isHeaterOn = true;
        System.out.println("Heater is ON");
    }

    static void increaseTemp() {
        if(isHeaterOn) {
            if(currentTemp < maxTemp) {
                currentTemp++;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Heater first");
        }
    }

    static void decreaseTemp() {
        if(isHeaterOn) {
            if(currentTemp > minTemp) {
                currentTemp--;
                System.out.println("Temperature : " + currentTemp);
            }
        } else {
            System.out.println("Turn ON the Heater first");
        }
    }
}
