package Dto;

import Bean.Address;

public class VictimCrimeDTO {
	
	private String name;
	private int age;
	private String gender;
	private String description;
	Address address;
	public VictimCrimeDTO() {
		super();
	}
	public VictimCrimeDTO(String name, int age, String gender, String description, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.description = description;
		this.address = address;
	}
	@Override
	public String toString() {
		return "VictimCrimeDTO [name=" + name + ", age=" + age + ", gender=" + gender + ", description=" + description
				+ ", address=" + address + "]";
	}

	
	

}
