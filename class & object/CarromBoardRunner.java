class CarromBoardRunner{
public static void main(String[] Board){

//ClassName  ref  = new ClassName();
CarromBoard board = new CarromBoard();
board.boardId = 1;
board.price = 999;
board.brandName = "JTC";
board.material = "EngineeredWood";
board.color = "Beige";
System.out.println("The boardId is : " + board.boardId);
System.out.println("The price is : " + board.price);
System.out.println("The brandName is : " + board.brandName);
System.out.println("The material is : " + board.material);
System.out.println("The color is : " + board.color);
System.out.println("---------------------------");

CarromBoard anotherBoard = new CarromBoard();
anotherBoard.boardId = 2;
anotherBoard.price = 1200;
anotherBoard.brandName = "WRF";
anotherBoard.material = "Wood";
anotherBoard.color = "white";
System.out.println("The boardId is : " + anotherBoard.boardId);
System.out.println("The price is : " + anotherBoard.price);
System.out.println("The brandName is : " + anotherBoard.brandName);
System.out.println("The material is : " + anotherBoard.material);
System.out.println("The color is : " + anotherBoard.color);
System.out.println("---------------------------");

CarromBoard board1 = new CarromBoard();
board1.boardId = 3;
board1.price = 1199;
board1.brandName = "ANOLOX";
board1.material = "Wood";
board1.color = "black";
System.out.println("The boardId is : " + board1.boardId);
System.out.println("The price is : " + board1.price);
System.out.println("The brandName is : " + board1.brandName);
System.out.println("The material is : " + board1.material);
System.out.println("The color is : " + board1.color);
System.out.println("---------------------------");
}

}