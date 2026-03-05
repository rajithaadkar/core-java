class Cafe{

// tea,coffe,snack
 static String teaNames[] = { amrutchaha, elachi, gingerchaha, greenchaha, masalachaha, lemonchaha };
static String  amrutchaha;
static String elachi;
static String  gingerchaha =  " Ginger Chaha";
static String greenchaha = "Green Chaha";
static String  masalachaha = " Masala Chaha";
static String lemonchaha = " Lemon Chaha" ;

 static String coffeNames[] = { cappucino, espresso, caffeAmericano, latte, mocha, lecheCondensada, cremeLatte, coldBrew, flatWhite, affogato };
 static String  cappucino = "Cappucino";
static String espresso = "Espresso";
 static String  caffeAmericano = "Caffe Americano";
static String latte = "Latte";
static  String  mocha = "Mocha";
static String lecheCondensada = "Leche Condensada";
static String  cremeLatte = "Creme Latte";
static String coldBrew = "Cold Brew";
static String  flatWhite = "Flat White";
static String affogato = "Affogato" ;
 
 static String snackNames[] = { samosa, breadPakora, vegMomos, paneerTikka, panipuri, masalapuri, meggie};	
  String  samosa  = "Samosa";
String  breadPakora  = "Bread Pakora";
String vegMomos	= "Veg Momos";
String paneerTikka	= "Paneer Tikka";
String  panipuri	= "pani puri";
String 	masalapuri	= "Masala puri";
String meggie	=  "meggie";

public static void main(String[] ref){

 String cafeName = " Cringe Cafe";
    
getTeaNames();	
getCoffeNames();
getSnackNames();

}
static void getTeaNames(){
	System.out.println("the available tea names are:");
	
	for(String teaName : teaNames)
	
   System.out.println(teaName);
}

static void getCoffeNames(){

System.out.println("List of Coffe Names are:");
		for(String coffeName : coffeNames)
	
   System.out.println(coffeName);
}

static void getSnackNames(){
System.out.println("List of Snacks Names are:");
  for(String snackName : snackNames)
	
   System.out.println(snackName);


}
}

