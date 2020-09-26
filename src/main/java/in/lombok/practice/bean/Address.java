package in.lombok.practice.bean;

import lombok.Data;

@Data
public class Address {

	private int zipCode;
	private String addressLineOne;
	private String addressLineTwo;
	private String state;
	private String country;
}
