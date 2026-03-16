class ApolloHospital
{
	
	static String doctorsNames[] = {"Dr.Shanmuk", "Dr.Shashi rekha", "Dr.Jyothi", "Dr.Prasanna", "Dr.Mahalakshmi", "Dr.Basavarajappa", "Dr.Mallesh"};
	static String specialists[] = {"Diabetic", "Gynocologist", "Dermatology", "Cardialogist","orthopedican", "urologist", "pediatrician"};
	
	
public static void getdoctorsNames()
	{
		System.out.println("The list of doctors available are ");
		for (String doctor : doctorsNames)
		{
			System.out.println(doctor);
		}
		System.out.println();
	}
	
	
	static void getspecialists()
	{
		System.out.println("The available specialists are ");
		for(String specialist : specialists)
		{
			System.out.println(specialist);
		}
	}
	
	
	
	
}
