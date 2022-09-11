package com.cg.serivces;

//public class EmployeeServiceImplementation implements EmployeeSerivce {
	
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

	import com.cg.entities.Employee;
	import com.cg.repository.EmployeeRepository;
	import com.cg.repository.EmployeeRepoImplementation;

  public class EmployeeServiceImplementation implements EmployeeSerivce {

		public boolean AddEmployee(Employee e) {
			String query="INSERT INTO EMPLOYEE VALUES(?,?)";
			EmployeeRepository repo=new EmployeeRepoImplementation();
			int count=repo.AddQuery(query, e);
			if(count==1)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}

		public Employee updateEmployee(Employee e) {
			String query="UPDATE EMPLOYEE SET name=? WHERE (ID=?)";
			EmployeeRepository repo=new EmployeeRepoImplementation();
			int count=repo.updateQuery(query, e);
			if(count==1)
			{
				Employee e2=GetEmployee(e.getId());
				return e2;
			}
			else
			{
				return null;
			}
		}

		public Employee GetEmployee(int ID) {
			Employee e=new Employee();
			EmployeeRepository repo=new EmployeeRepoImplementation();
			String query="SELECT * FROM EMPLOYEE WHERE ID=" +ID;
			ResultSet r=repo.RetrevieQuery(query);
			
			try {
				r.next();
				e.setId(r.getInt(1));
				e.setName(r.getString(2));
			}
			catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return e;
			
		}

		public List<Employee> GetEmployees() {
			List<Employee>emp=new ArrayList<Employee>();
			EmployeeRepository repo=new EmployeeRepoImplementation();
			String query="SELECT * FROM EMPLOYEE";
			ResultSet r=repo.RetrevieQuery(query);
			
			try {
				while(r.next())
				{
					Employee e=new Employee();
					e.setId(r.getInt(1));
					e.setName(r.getString(2));
					emp.add(e);
					
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return emp;

		}

		public boolean deleteEmployee(int ID) {
			EmployeeRepository repo=new EmployeeRepoImplementation();
			String query="DELETE FROM EMPLOYEE WHERE ID=" +ID;
			int count=repo.deleteQuery(query);
			if(count==1)
			{
				return true;
			}
			else
			{
				return false;
			}
			
		}

	}
