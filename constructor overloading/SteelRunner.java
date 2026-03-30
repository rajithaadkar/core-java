class SteelRunner {
    public static void main(String[] a) {

        Steel s1=new Steel(1,"Alloy",10,"A1",true);
		s1.display();
        Steel s2=new Steel(2,"Carbon",12,"B2",true);
		s2.display();
        Steel s3=new Steel(3,"Stainless",8,"C3",false);
		s3.display();
        Steel s4=new Steel(4,"Tool",15,"D4",true);
		s4.display();
        Steel s5=new Steel(5,"Alloy",11,"A2",false);
		s5.display();
        Steel s6=new Steel(6,"Carbon",13,"B3",true);
		s6.display();
    }
}
