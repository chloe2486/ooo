package java練習;

public class Bookmain {

	public static void main(String[] args) {
		Book book1 = new Book();

		book1.name = "羅生門";
		book1.author = "芥川龍之介";
		book1.price = 800;
		book1.issued = 500000;

		book1. showInfo();
		
		Book book2 = new Book("王様ゲーム", "嵯峨", 600,10000);
		Book book3 = new Book("ドラゴンボール", "鳥山明", 400, 1000000);
		
		book2.showInfo();
		book3.showInfo();
		
		book1.bookIsuued(1000);
		book2.bookIsuued(1000);
		book3.bookIsuued(10000);
		
		book1.showInfo();
		book2.showInfo();
		book3.showInfo();
	}

}
