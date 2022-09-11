package com.cg.serivces;


	import java.util.List;

	import com.cg.entities.Employee;

	public interface EmployeeSerivce {
		public boolean AddEmployee(Employee e);
		public Employee updateEmployee(Employee e);
		public Employee GetEmployee(int id);
		public List<Employee> GetEmployees();
		public boolean deleteEmployee(int id);

	
}
