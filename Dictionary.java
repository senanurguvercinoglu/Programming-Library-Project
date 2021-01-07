package hw1;

public class Dictionary extends Book {

	int definitions;

	public Dictionary(int id, String title, Author author, int definitions) {
		super(id, title, author);
		this.definitions = definitions;
		if (title.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}
		if (id < 0 || definitions < 0) {
			throw new IllegalArgumentException("Input  must be positive value: ");

		}

	}

	public Dictionary(int id, String title, int definitions) {
		super(id, title);
		this.definitions = definitions;
		if (title.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}
		if (id < 0 || definitions < 0) {
			throw new IllegalArgumentException("Input must be positive value: ");
		}

	}

	public void setDefinitions(Integer definitions) {
		this.definitions = definitions;
	}

	public Integer getDefinitions() {
		return definitions;

	}

	@Override
	public String toString() {
		return "Dictionary Name is :" + this.getTitle() + ", definitions:" + definitions + ".";

	}

}
