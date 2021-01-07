package hw1;

public class Book {
	private Integer id;
	private String title;
	Author author;
	static Boolean borrowed = false;

	public Book(int id, String title, Author author) {

		this.id = id;
		this.title = title;
		this.author = author;

		if (title.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol: ");

		}
		if (id < 0) {
			throw new IllegalArgumentException("Input id must be positive value: ");

		}
	}

	public Book(int id, String title) {
		if (title.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		if (id < 0) {
			throw new IllegalArgumentException("Input id must be positive value: ");
		}
		this.id = id;
		this.title = title;

	}

	// Returns true if the book is rented, false otherwise

	public boolean isBorrowed() {

		return borrowed;// find out if the book is available

	}

	public boolean borrowed() {

		borrowed = true;// borrow the book

		return true;

	}

	public void returned() {

		borrowed = false;// return the book.

	}

	@Override
	public String toString() {
		return "Book name is " + this.title + ",Author is" + author;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getId() {
		return id;

	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getBorrowed() {
		return borrowed;

	}

	public void setBorrowed(Boolean borrowed) {
		Book.borrowed = borrowed;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;

	}

}