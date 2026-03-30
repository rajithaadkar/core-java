class PawnRunner {
    public static void main(String[] a) {

        Pawn p1=new Pawn(1,"White",1.2,"Wood",true);
		p1.display();
        Pawn p2=new Pawn(2,"Black",1.3,"Plastic",true);
		p2.display();
        Pawn p3=new Pawn(3,"White",1.1,"Metal",false);
		p3.display();
        Pawn p4=new Pawn(4,"Black",1.4,"Wood",true);
		p4.display();
        Pawn p5=new Pawn(5,"White",1.0,"Plastic",false);
		p5.display();
        Pawn p6=new Pawn(6,"Black",1.5,"Metal",true);
		p6.display();
    }
}