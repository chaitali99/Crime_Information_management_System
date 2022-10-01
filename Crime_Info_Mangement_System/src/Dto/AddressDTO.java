package Dto;

public class AddressDTO {
	private String buildingName;
	private String street_no;
	private String area;
	private String city;
	private String state;
	private String country;
	private String pincode;
	public AddressDTO() {
		super();
	}
	public AddressDTO(String buildingName, String street_no, String area, String city, String state, String country,
			String pincode) {
		super();
		this.buildingName = buildingName;
		this.street_no = street_no;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "AddressDTO [buildingName=" + buildingName + ", street_no=" + street_no + ", area=" + area + ", city="
				+ city + ", state=" + state + ", country=" + country + ", pincode=" + pincode + "]";
	}

	
	
}
