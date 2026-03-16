class WaterHeaterExecuter {

    public static void main(String[] args) {

        WaterHeater.turnOn();
		
		System.out.println("Increasing Temparature");
        WaterHeater.increaseTemp();
        WaterHeater.increaseTemp();
		
		System.out.println("Decreasing Temparature");
        WaterHeater.decreaseTemp();

    }
}