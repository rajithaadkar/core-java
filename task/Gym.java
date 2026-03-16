class Gym
{
	static String trainerNames[]={"Harley Pasternak", "Duffy Gaver", "Basu Shanker ", " Cindy Jourdain", "Radhika Karle", "Deanne Pandey", "Rani jose", "Prashant Sawant"};
	static String equipmentNames[] = {"Treadmills", "Ellipticals", "Rowing machines", "Dumbbels", "Barbells", "Weight plates", "kettleballs", "benches", "squat racks", "stair climber"};
	
public	static void getTrainerNames()
	{
		System.out.println("The trainers are ");
		for(String trainer : trainerNames)
		{
			System.out.println(trainer);
		}
	}
	
	static void getEquipmentNames()
	{
		System.out.println("\n Available equipments are ");
		for(String equipment : equipmentNames)
		{
			System.out.println(equipment);
		}
	}
	
}