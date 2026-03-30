class BookRunner {
    public static void main(String[] a) {

        Book b1=new Book(1,"Java",500,"James",true);
		b1.display();
        Book b2=new Book(2,"Python",450,"Guido",true);
		b2.display();
        Book b3=new Book(3,"C++",400,"Bjarne",false);
		b3.display();
        Book b4=new Book(4,"HTML",300,"Tim",true);
		b4.display();
        Book b5=new Book(5,"DBMS",350,"Date",false);
		b5.display();
        Book b6=new Book(6,"OS",600,"Galvin",true);
		b6.display();
    }
}