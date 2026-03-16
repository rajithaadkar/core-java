class MobileApp{

public static void register(String patientname, String symptom, String email, long phoneNumber){

System.out.println("Register method started");
Reception.book(patientname, symptom, email,phoneNumber);
System.out.println("Register method ended");

}
}