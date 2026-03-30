class BatteryRunner {
    public static void main(String[] a) {

        Battery b1=new Battery(1,"Li-ion",5000,"Sony",true);
		b1.display();
        Battery b2=new Battery(2,"NiMH",3000,"Duracell",false);
		b2.display();
        Battery b3=new Battery(3,"Li-ion",6000,"Samsung",true);
		b3.display();
        Battery b4=new Battery(4,"Lead",7000,"Exide",false);
		b4.display();
        Battery b5=new Battery(5,"Li-ion",4000,"LG",true);
		b5.display();
        Battery b6=new Battery(6,"NiCd",2000,"Panasonic",false);
		b6.display();
    }
}