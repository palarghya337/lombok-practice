package in.lombok.practice.bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void getterSetterTest() {
		
		String id = "LO-1002";
		String name = "Ajay Chakraborty";
		Team team101 = createTeam101();
		Employee lead = createLead();
		lead.setTeam(team101);
		
		Employee employee = new Employee(id, name);
		employee.setDesignation(new Designation(101, "Software Engineer"));
		employee.setTeam(team101);
		
		List<Employee> listOfEmployees = team101.getEmployees();
		listOfEmployees.add(lead);
		listOfEmployees.add(employee);
		
		assertEquals(id, employee.getId());
		assertEquals(name, employee.getName());
		assertEquals(team101, employee.getTeam());
		assertNull(employee.getCurrentAddress());
		assertNull(employee.getPermanentAddress());
		assertNull(employee.getDepartment());
		System.out.println("Getter Setter test is done");
		System.out.println(employee);
		System.out.println(team101);
	}
	private Employee createLead() {
		
		Employee lead = new Employee("LO-1001", "Sanket Shirke");
		lead.setDesignation(new Designation(102, "Team Lead"));
		return lead;
	}
	private Team createTeam101() {
		Team team = new Team(101, "Team-101");
		team.setEmployees(new ArrayList<>());
		return team;
	}
}
