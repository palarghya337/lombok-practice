package in.lombok.practice.bean;

import lombok.Value;

// To create immutable class we can use @Value annotation.
@Value
public class Designation {

	private int id;
	private String name;
}
