class Speaker {

    static int minVolume = 0;
    static int maxVolume = 10;
    static int currentVolume;
    static boolean isSpeakerOn;

    static void turnOn() {
		if (isSpeakerOn == false){
        isSpeakerOn = true;
		System.out.println("Speaker is ON");
		}
		else{
			isSpeakerOn = false;
			System.out.println("Speaker is OFF");
		}
    }

    static void increaseVolume() {
        if(isSpeakerOn) {
            if(currentVolume < maxVolume) {
                currentVolume++;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Speaker first");
        }
    }

    static void decreaseVolume() {
        if(isSpeakerOn) {
            if(currentVolume > minVolume) {
                currentVolume--;
                System.out.println("Volume : " + currentVolume);
            }
        } else {
            System.out.println("Turn ON the Speaker first");
        }
    }
}