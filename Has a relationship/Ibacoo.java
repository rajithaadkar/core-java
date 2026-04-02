class Ibacoo{

String iceCreams[] = new String[10];
int index;

public boolean addIceCream (String iceCream){ 

boolean isIceCreamAdded = false;
  
  if(iceCream != null && !iceCream.isEmpty()){
  iceCreams[index++] = iceCream;
  isIceCreamAdded = true;
  }
  else
  System.out.println(iceCream + " not valid");
  
  return isIceCreamAdded;

}

public void getIceCreams(){
System.out.println("The list of IceCreams are :");

for(String iceCream : iceCreams)
System.out.println(iceCream);

}


}