class Nurse{

public static void basicCheck(String patientname, String symptom){

System.out.println("basic Check method Started");
Doctor.treat(patientname, symptom);
System.out.println("basic Check ended");
}
}