package in.lombok.practice.bean;

import java.util.List;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

@Data
public class Team {

	private final int id;
	@NonNull
	private String name;
	/*
	 * Some times we need to exclude some properties from the toString() method
	 * Here we are excluding list of employees to print using toString() because
	 * of circular dependency.
	 **/
	@ToString.Exclude
	private List<Employee> employees;
}
