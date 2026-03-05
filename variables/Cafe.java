class Cafe{

// tea,coffe,snack

public static void main(String[] ref){

    String cafeName = " Cringe Cafe";

    String teaNames[] = { "Amrut Caha", "Elachi Chaha", " Ginger Chaha", "Green Chaha", " Masala Chaha", " Lemon Chaha" };
    String coffeNames[] = { "Cappucino", "Espresso", "Caffe Americano", "Latte", "Mocha", "Leche Condensada", "Creme Latte", "Cold Brew", "Flat White", "Affogato" };
    String snackNames[] = { "Samosa", "Bread Pakora", "Veg Momos", "Paneer Tikka", "pani puri", "Masala puri", "meggie", "French fries", "Pasta", "Fried momos"};

    System.out.println(" the cafe name is:" + cafeName);
	
	//int noOfTeaNames = teaNames.length ;
	System.out.println("No of tea added are:"  + teaNames.length);
	
	System.out.println(" List of Different Tea Names are:");
	 
	 for(String teaname : teaNames){
	System.out.println(teaname);
    }
	
	//System.out.println(teaNames[0]+ " \n "+ teaNames[1]+ "\n "+ teaNames[2]+ "\n "+ teaNames[3]+ "\n "+ teaNames[4]+ "\n "+ teaNames[5]);
	
	System.out.println("No of coffe added are:"  + coffeNames.length);
    System.out.println("List of Coffe Names are:");
	for(String coffename : coffeNames){
		System.out.println(coffename);
	}
    //System.out.println(coffeNames[0]+ "\n" + coffeNames[1]+ "\n" + coffeNames[2]+ "\n" + coffeNames[3]+ "\n" + coffeNames[4]+ "\n" + coffeNames[5]+ "\n" + coffeNames[6]+ "\n" + 
                      // coffeNames[7]+ "\n" + coffeNames[8]+ "\n" + coffeNames[9]);				    
					    
	System.out.println("List of Snacks Names are:");
	for(String snackname : snackNames){
		System.out.println(snackname);
	}
    //System.out.println(snackNames[0]+ "\n" + snackNames[1]+ "\n" + snackNames[2]+ "\n" + snackNames[3]+ "\n" + snackNames[4]+ "\n" + snackNames[5]+ "\n" + snackNames[6]+ "\n" + 
                      // snackNames[7]+ "\n" + snackNames[8]+ "\n" + snackNames[9]);
				   

}

}


//String  amrut chaha = teaNames[0] ;
//System.out.println(amrut chaha);
//String Elachi = teaNames[1];
//System.out.println(Elachi);

// for each
