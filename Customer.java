package hw1;

public class Customer extends Person {

	private String address;
	private Book borrowedBook;
	private Boolean borrowABook;

	public Customer(String name, String birthPlace, int birthDate, String address) {

		super(name, birthDate, birthPlace);
		this.address = address;
		if (birthPlace.length() < 3 || address.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}
		if (birthDate < 0) {
			throw new IllegalArgumentException("Input birthDate must be positive value: ");
		}

	}

	public Customer(String name, int birthDate, String address) {

		super(name, birthDate);
		this.address = address;
		if (name.length() < 3 || address.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		if (birthDate < 0) {
			throw new IllegalArgumentException("Input birthDate must be positive value: ");
		}

	}

	public Customer(String name, String address) {
		super(name);
		if (name.length() < 3 || address.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		this.address = address;

	}

	public Customer(String name, int birthDate) {
		super(name, birthDate);
		if (name.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		if (birthDate < 0) {
			throw new IllegalArgumentException("Input birthDate must be positive value: ");
		}

	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setBorrowABook(Boolean borrowABook) {
		this.borrowABook = borrowABook;
	}

	public Boolean getBorrowABook() {
		return borrowABook;
	}

	public void setBorrowedBook(Book borrowedBook) {
		this.borrowedBook = borrowedBook;
	}

	public Book getBorrowedBook() {

		return borrowedBook;
	}

	@Override
	public String toString() {
		if (this.getBirthPlace() == null && this.address == null) {
			return "Name: " + this.getName() + " Birth Date: " + this.getBirthDate() + " Birth Place: " + "-" + "\n"
					+ "Address:" + "-";
		} else if (this.getBirthPlace() == null && this.getBirthDate() == null) {
			return "Name: " + this.getName() + " Birth Date: " + "-" + " Birth Place: " + "-" + "\n" + "Address:"
					+ this.address;
		} else if (this.getBirthPlace() == null) {

			return "Name: " + this.getName() + " Birth Date: " + this.getBirthDate() + " Birth Place: " + "-" + "\n"
					+ "Address:" + this.address;

		} else if (this.address == null) {
			return "Name: " + this.getName() + " Birth Date: " + this.getBirthDate() + " Birth Place: "
					+ this.getBirthPlace() + "\n" + "Address:" + "-";
		} else {
			return "Name: " + this.getName() + " Birth Date: " + this.getBirthDate() + " Birth Place: "
					+ this.getBirthPlace() + "\n" + "Address:" + this.address;
		}

	}

}
