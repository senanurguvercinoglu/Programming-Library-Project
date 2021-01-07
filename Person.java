package hw1;

public class Person {

	private String name;
	private String birthDate;
	private String birthPlace;

	public Person(String name, int birthDate, String birthPlace) {
		this.name = name;
		if (birthDate < 0) {
			throw new IllegalArgumentException("Input birthDate must be positive value: ");
		}
		if (birthPlace.length() < 3 || name.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}

		this.birthDate = String.valueOf(birthDate);
		this.birthPlace = birthPlace;

	}

	public Person(String name, int birthDate) {
		this.name = name;
		this.birthDate = String.valueOf(birthDate);
		if (name.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}
		if (birthDate < 0) {
			throw new IllegalArgumentException("Input birthDate must be positive value: ");
		}

	}

	public Person(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("Input should not be less than 3 symbol : ");
		}
		this.name = name;

	}

	public String getName() {

		return name;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = String.valueOf(birthDate);

	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;

	}

	@Override
	public String toString() {
		return name + ",Birth Date:  " + birthDate + ",  Birth Place:  " + birthPlace;

	}

}
