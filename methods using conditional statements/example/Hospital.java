class Hospital{

public static void bookAppointment(String patientname, String symptom){

System.out.println("bookAppointment method started");
Nurse.basicCheck(patientname, symptom);
System.out.println("bookAppointment method ended");
}
}