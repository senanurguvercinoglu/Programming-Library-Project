package hw1;

//this java project has several classes and implement a simple rental system for libraries.

import java.util.ArrayList;

public class Library {

	private String address;
	private ArrayList<Book> books = new ArrayList<Book>();

	private ArrayList<Customer> customers = new ArrayList<Customer>();

	public Library() {

		this.books = new ArrayList<Book>();// make a book list
		this.customers = new ArrayList<Customer>();// make a customer list

	}

	public Library(String address) {
		if (address.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		this.address = address;

	}

	public void printOpeningHours() {
		System.out.println("Libraries are open daily from 9 am to 5 pm.");// print opening hours

	}

	public void printAddress() {
		System.out.println(this.address);// printing library address

	}

	public boolean addBook(Book book) {// add book to the books list

		books.add(book);

		return false;

	}

	public boolean addCustomer(Customer customer) {

		customers.add(customer);// add customer to the customers list
		return false;
	}

	public void borrowBook(String bookName, String personName) {// borrowing book from the books list

		int y = 0;
		int s = 0;
		for (Customer c : customers) {
			if (c.getName().contains(personName)) {// checks if it is person name is customer name or not.
				if (s == 0)
					;
				{
					s = 1;
				}

				for (Book b : books) {
					if (b.getTitle().contentEquals(bookName)) {
						if (y == 0)
							;
						{

							// checks if book is available at books list or already borrowed.
							y = 1;
						}
						System.out.println("Sorry, this book is already borrowed.");
						break;

					}
					if (!b.isBorrowed()) {// checks if you succesfully borrowed the book.
						b.borrowed();
						System.out.println(personName + " successfully borrowed " + bookName);

						y = 2;
						break;

					}

				}
			}

		}
		if (s == 0) {
			System.out.println("Sorry, " + personName + " is not a customor");

		} else if (y == 0) {
			System.out.println("Sorry, this book is not in our catalog.");

		}

	}

	public void returnBook(String personName) {

		if (personName.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		int f = 0;
		for (Customer c : customers) {// checks if the person name is in the customers list or not.
			if (c.getName().contains(personName)) {
				if (f == 0)
					;
				{
					f = 1;
				}

				for (Book b : books) { // if name is customer's name then continue with book returned part.
					b.returned();

					f = 2;
					System.out.println(personName + " succesfully returned " + b.getTitle());
					break;
				}
			}

			if (f == 0) {
				System.out.println("Sorry, " + personName + " is not a customor");
				break;
			}
		}

	}

	public void printAvailableBooks() {// prints available books in the books list

		boolean bookPresent = false;
		for (Book book : books) {// search the books borrowed or not and then print it
			if (book.isBorrowed()) {

				System.out.println(book.toString());
				bookPresent = true;
			}
		}
		if (!bookPresent) {
			System.out.println("No book in catalog");
		}

	}

	public ArrayList<Book> getBooks() {

		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

}
