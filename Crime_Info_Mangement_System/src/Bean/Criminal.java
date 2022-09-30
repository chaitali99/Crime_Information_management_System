package Bean;

public class Criminal {
	private String name;
	private int age;
	private String gender;
	private String mark;
	private int policeStationFirstArrested;
	Address address;
	
	public Criminal() {
		// TODO Auto-generated constructor stub
	}

	public Criminal(String name, int age, String gender, String mark, int policeStationFirstArrested, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.mark = mark;
		this.policeStationFirstArrested = policeStationFirstArrested;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public int getPoliceStationFirstArrested() {
		return policeStationFirstArrested;
	}

	public void setPoliceStationFirstArrested(int policeStationFirstArrested) {
		this.policeStationFirstArrested = policeStationFirstArrested;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Criminal [name=" + name + ", age=" + age + ", gender=" + gender + ", mark=" + mark
				+ ", policeStationFirstArrested=" + policeStationFirstArrested + ", address=" + address + "]";
	}
	
	
}
