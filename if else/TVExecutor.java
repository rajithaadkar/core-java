class TVExecutor {

    public static void main(String[] args) {

        TV.turnOn();
        System.out.println("Please turn on the TV");

        TV.increaseVolume();
        TV.increaseVolume();
        TV.increaseVolume();
        TV.increaseVolume();
        TV.increaseVolume();

        System.out.println("Increasing Volume : " + TV.currentVolume);

        TV.decreaseVolume();
        System.out.println("Decreasing Volume : " + TV.currentVolume);

    }
}