package com.cg.ArrayDemo;

class Student
	{
		public int roll_no;
		public String name;
		//constructor
		
		Student(int roll_no,String name)
		{
			this.roll_no=roll_no;
			this.name=name;
		}
	}
	public class StudentArray {

		public static void main(String[] args) {
			Student [] arr=new Student[4];
			
			arr[0]=new Student(101,"sayli");
			arr[1]=new Student(102,"shraddha");
			arr[2]=new Student(103,"amisha");
			arr[3]=new Student(104,"siddha");
			
			for(int i=0;i<arr.length;i++) 
			{
				System.out.println("Element at "+i+" index :"+arr[i].roll_no+" "+arr[i].name );
			}
			
			
		}

	}