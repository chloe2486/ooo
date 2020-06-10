package java練習;

public class Book {
	//フィールド
	String name;	//図書名
	String author;	//著者名
	int price;		//値段
	int issued;		//発行部数
	//引数なしのコンストラクタ
	public Book(){
		name = "なし";
		author = "なし";
		price = 0;
		issued = 0;
	}
	//引数ありのコンストラクタ
	public Book(String name, String author, int price, int issued){
		this.name = name;
		this.author = author;
		this.price = price;
		this.issued = issued;
	}
	//4つの情報をすべて表示するメソッド
	public void showInfo(){
		System.out.println("図書名：" + name);
		System.out.println("著書名:" + author );
		System.out.println("値段："+ price);
		System.out.println("発行部数：" + issued);
		
	}
	//引数で受け取った値の分の発行部数を増やす
	public void bookIsuued(int n){
		issued += n;
		System.out.println(name + "が" + n + "部増刷されました。");
	}
}

