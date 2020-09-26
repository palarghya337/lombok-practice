package in.lombok.practice.bean;

import lombok.Data;
import lombok.NonNull;

@Data
public class Department {

	private final String id;
	@NonNull
	private String name;
	private String description;
}
