class ChessBoardRunner {
    public static void main(String[] a) {

        ChessBoard c1=new ChessBoard(1,"Wood",15,"Brown",true);
		c1.display();
        ChessBoard c2=new ChessBoard(2,"Plastic",12,"Black",false);
		c2.display();
        ChessBoard c3=new ChessBoard(3,"Glass",14,"White",true);
		c3.display();
        ChessBoard c4=new ChessBoard(4,"Wood",16,"Brown",false);
		c4.display();
        ChessBoard c5=new ChessBoard(5,"Metal",13,"Grey",true);
		c5.display();
        ChessBoard c6=new ChessBoard(6,"Plastic",11,"Black",false);
		c6.display();
    }
}