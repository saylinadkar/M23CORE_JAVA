package com.cg.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.cg.entities.Employee;

public interface EmployeeRepository 
{
	
	Statement createStatement();
	PreparedStatement createPreparedStatement(String query);
	public ResultSet RetrevieQuery(String query);//Retrieve
	public int AddQuery(String query,Employee e);// add
	public int updateQuery(String query,Employee e);//update
	public int deleteQuery(String query);//delete
	

}
