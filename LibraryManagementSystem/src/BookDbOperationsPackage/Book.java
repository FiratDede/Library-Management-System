package BookDbOperationsPackage;

public class Book {
	private int id,amount,totalPage;
	private String bookName,author;
	public Book(int id, String bookName, String author, int amount, int totalPage) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.author = author;
		this.amount = amount;
		this.totalPage = totalPage;
	}
	public String[] toStringArray() {
		return new String[] {Integer.toString(this.id),this.bookName,
				this.author,Integer.toString(this.amount),Integer.toString(this.totalPage)}; 
	}	
	

}
