package com.enroe.subway.domain;

public class StationDTO {
	private String id;
	private String name;
	private int location;
	
	public StationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StationDTO(String id, String name, int location) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLocation() {
		return location;
	}

	public void setLocation(int location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "StationDTO [id=" + id + ", name=" + name + ", location=" + location + "]";
	}
	
	
}
