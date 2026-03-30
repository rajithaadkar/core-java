class TrackRunner {
    public static void main(String[] a) {

        Track t1=new Track(1,"Running",400,"Stadium",true);
		t1.display();
        Track t2=new Track(2,"Cycling",1000,"Outdoor",false);
		t2.display();
        Track t3=new Track(3,"Race",500,"Arena",true);
		t3.display();
        Track t4=new Track(4,"Practice",300,"Ground",false);
		t4.display();
        Track t5=new Track(5,"Sprint",200,"Indoor",true);
		t5.display();
        Track t6=new Track(6,"Jogging",600,"Park",false);
		t6.display();
    }
}