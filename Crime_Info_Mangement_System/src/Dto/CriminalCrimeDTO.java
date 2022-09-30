package Dto;

import Bean.Address;

public class CriminalCrimeDTO {
	private String criminalName;
	private int age;
	private String gender;
	private String mark;
	private String description;
	Address address;
	public CriminalCrimeDTO(String criminalName, int age, String gender, String mark, String description,
			Address address) {
		super();
		this.criminalName = criminalName;
		this.age = age;
		this.gender = gender;
		this.mark = mark;
		this.description = description;
		this.address = address;
	}
	public CriminalCrimeDTO() {
		super();
	}

	@Override
	public String toString() {
		return "CriminalCrimeDTO [criminalName=" + criminalName + ", age=" + age + ", gender=" + gender + ", mark="
				+ mark + ", description=" + description + ", address=" + address + "]";
	}
	
	

}
