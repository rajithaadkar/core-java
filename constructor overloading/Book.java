class Book {
    int id;
	String title;
	double price;
	String author;
	boolean available;

    Book() {}
    Book(int id) { this.id = id; }
    Book(int id, String title) { this.id = id; this.title = title; }
    Book(int id, String title, double price) { this.id = id; this.title = title; this.price = price; }
    Book(int id, String title, double price, String author) { this.id = id; this.title = title; this.price = price; this.author = author; }
    Book(int id, String title, double price, String author, boolean available) {
        this.id = id;
		this.title = title;
		this.price = price;
		this.author = author;
		this.available = available;
    }

    void display() {
System.out.println("id is"+ id);
		System.out.println("title is" + title);
		System.out.println("price is" + price);
		System.out.println("author is" + author);
		System.out.println("Is it is available" + available); 		}
}
