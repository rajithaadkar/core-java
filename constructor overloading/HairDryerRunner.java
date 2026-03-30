class HairDryerRunner {
    public static void main(String[] a) {

        HairDryer h1=new HairDryer(1,"Philips",1200,"Black",true);
		h1.display();
        HairDryer h2=new HairDryer(2,"Syska",1400,"White",true);
		h2.display();
        HairDryer h3=new HairDryer(3,"Panasonic",1600,"Grey",false);
		h3.display();
        HairDryer h4=new HairDryer(4,"Havells",1800,"Red",true);
		h4.display();
        HairDryer h5=new HairDryer(5,"Nova",1100,"Blue",false);
		h5.display();
        HairDryer h6=new HairDryer(6,"Vega",1500,"Black",true);
		h6.display();
    }
}