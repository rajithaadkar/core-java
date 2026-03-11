class WashingMachine {

    static boolean isMachineOn;
    static int minSpeed = 0;
    static int maxSpeed = 5;
    static int currentSpeed;

    static void turnOn() {
        isMachineOn = true;
        System.out.println("Washing Machine is ON");
    }

    static void increaseSpeed() {
        if(isMachineOn) {
            if(currentSpeed < maxSpeed) {
                currentSpeed++;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Machine first");
        }
    }

    static void decreaseSpeed() {
        if(isMachineOn) {
            if(currentSpeed > minSpeed) {
                currentSpeed--;
                System.out.println("Speed : " + currentSpeed);
            }
        } else {
            System.out.println("Turn ON the Machine first");
        }
    }
}