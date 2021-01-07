package hw1;

public class Author extends Person {
	private String publisher;

	private String author;

	public Author(String name, String publisher, int birthDate) {

		super(name, birthDate);
		this.publisher = publisher;
		this.author = name;
		if (name.length() < 3 || publisher.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		if (birthDate < 0) {
			throw new IllegalArgumentException("Input birthDate must be positive value: ");
		}

	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		if (publisher.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		this.publisher = publisher;
	}

	/**
	 *
	 */
	@Override
	public String toString() {

		return author + ".";

	}

}
