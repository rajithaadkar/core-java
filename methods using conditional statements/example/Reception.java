class Reception{

public static void book(String patientname, String symptom, String email, long phoneNumber){

System.out.println("Book method Started");
Hospital.bookAppointment(patientname, symptom);
System.out.println("Book method ended");

}
}