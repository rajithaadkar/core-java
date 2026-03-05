class Olympics{

static String sportNames[] = {"Swimming" , "cycling", "Relay", "Wrestling", "Archery", "Hockey", "Tennis" };

public static void getSportNames(){

System.out.println("getSportNames invoked");
for(String sportName : sportNames ){
System.out.println(sportName);
}
System.out.println("end of getSportNames");

}


}