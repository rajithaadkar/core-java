class IronBoxExecuter {

    public static void main(String[] args) {

        IronBox.turnOn();
		
		System.out.println("Increasing Temparature");
        IronBox.increaseHeat();
        IronBox.increaseHeat();
		IronBox.increaseHeat();
		
		System.out.println("Decreasing Temparature");
        IronBox.decreaseHeat();

    }
}