class SpeakerExecuter {

    public static void main(String[] args) {

       Speaker.turnOn();

        System.out.println("Increasing Volume");
        Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
		Speaker.increaseVolume();
        System.out.println("Current Volume: " + Speaker.currentVolume);

        System.out.println("Decreasing Volume");
        Speaker.decreaseVolume();
		Speaker.decreaseVolume();
		Speaker.decreaseVolume();
        System.out.println("Current Volume: " + Speaker.currentVolume);

      
    }
}
