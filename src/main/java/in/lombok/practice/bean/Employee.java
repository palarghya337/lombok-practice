package in.lombok.practice.bean;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
/* 
 * @EqualsAndHashCode annotation is use to generate hashCode()
 * and equals() method
 **/
@EqualsAndHashCode
@RequiredArgsConstructor
public class Employee {

	/* 
	 * When we do not want setter method of a particular field
	 * but want to use @Data annotation.
	 **/
	@Setter(value = AccessLevel.NONE)
	private final String id;
	@NonNull
	private String name;
	private Address currentAddress;
	private Address permanentAddress;
	private Designation designation;
	private Department department;
	private Team team;
}
