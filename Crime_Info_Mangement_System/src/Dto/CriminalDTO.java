package Dto;

import java.sql.Date;

public class CriminalDTO {
	private String criminalName;
	private Date dateOfCrime;
	private String description;
	private String detailDescription;
	
	public CriminalDTO() {
		// TODO Auto-generated constructor stub
	}

	public CriminalDTO(String criminalName, Date dateOfCrime, String description, String detailDescription) {
		super();
		this.criminalName = criminalName;
		this.dateOfCrime = dateOfCrime;
		this.description = description;
		this.detailDescription = detailDescription;
	}

	@Override
	public String toString() {
		return "CrimesOfCriminalDTO [criminalName=" + criminalName + ", dateOfCrime=" + dateOfCrime + ", description="
				+ description + ", detailDescription=" + detailDescription + "]";
	}
}
