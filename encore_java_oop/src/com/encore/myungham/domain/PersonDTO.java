package com.encore.myungham.domain;

public class PersonDTO {
	private String name;
	private String number;
	private String email;
	private String fax;
	private String homepage;
	private String company;
	private String position;
	private String address;
	
	public PersonDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonDTO(String name, String number, String email, String fax, String homepage, String company,
			String position, String address) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.fax = fax;
		this.homepage = homepage;
		this.company = company;
		this.position = position;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "PersonDTO [name=" + name + ", number=" + number + ", email=" + email + ", fax=" + fax + ", homepage="
				+ homepage + ", company=" + company + ", position=" + position + ", address=" + address + "]";
	}
	
	
}
