package Bean;

import java.time.LocalDate;

public class Victim {
	private String name;
	private int age;
	private String gender;
	Address address;
	
	
	public Victim(String name, int age, String gender, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}


	public Victim() {
		
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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Victim [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + "]";
	}
	
	

}
