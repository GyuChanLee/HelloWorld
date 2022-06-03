package co.edu;

public class Todo {
	
	private int listNumber;
	private String title;
	
	Todo() {}
	
	public Todo(int listNumber, String title) {
		super();
		this.listNumber = listNumber;
		this.title = title;
	}
	public int getListNumber() {
		return listNumber;
	}
	public void setListNumber(int listNumber) {
		this.listNumber = listNumber;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
