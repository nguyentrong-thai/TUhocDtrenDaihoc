package core;

public class Person {
	// Hằng số
	public static final String FIRSTNAME = "NO FirstName";
	public static final String LASTNAME = "NO LastName";
	public static final Address ADDRESS = new Address();
	public static final byte AGE = 0;

	// Biến đếm số lượng đối tượng Person đã tạo
	private static int count = 0;

	// Thuộc tính
	private String firstName;
	private String lastName;
	protected byte age;
	private Address address;


	// Constructor mặc định
	public Person() {
		this.firstName = FIRSTNAME;
		this.lastName = LASTNAME;
		this.age = AGE;
		this.address = new Address();
		count++;
	}

	// Constructor có 2 tham số (tên, họ)
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = AGE;
		this.address = new Address();
		count++;
	}

	// Constructor có 2 tham số (tên, tuổi)
	public Person(String firstName, byte age) {
		this.firstName = firstName;
		this.lastName = LASTNAME;
		this.age = age;
		this.address = new Address();
		count++;
	}

	// Constructor có 1 tham số (tuổi)
	public Person(byte age) {
		this.firstName = FIRSTNAME;
		this.lastName = LASTNAME;
		this.age = age;
		this.address = new Address();
		count++;
	}

	// Constructor đầy đủ
	public Person(String firstName, String lastName, byte age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = new Address();
		count++;
	}

	// Constructor có địa chỉ
	public Person(String firstName, String lastName, byte age, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
		count++;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public static int getCount() {
		return count;
	}


	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", address=" + address + "]";
	}
	
}