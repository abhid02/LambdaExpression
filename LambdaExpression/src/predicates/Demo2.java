package predicates;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
	String ename;
	int salary;
	int experience;
	
	Employee(String name,int sal,int exp)
	{
		ename=name;
		salary=sal;
		experience=exp;
	}
	
}

public class Demo2 

{
	public static void main(String[] args) 
	
	{
		//Example 1
		
		Employee emp=new Employee("John",50000,5);
        
		//emp obj-->return name if sal>30k exp>3
		
		Predicate<Employee> pr=e->(e.salary>30000 && e.experience>3);
		
		System.out.println(pr.test(emp)); //true
		
		//Example 2
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		
		al.add(new Employee("John",50000,5));
		al.add(new Employee("David",20000,2));
		al.add(new Employee("Scott",30000,3));
		al.add(new Employee("Smith",40000,6));
		
		for(Employee e:al)
		{
			if(pr.test(e))
			//if(e.salary>30000 && e.experience>3)
			{
				System.out.println(e.ename+" "+e.salary);//John 50000 Smith 40000
			}
		}	
	}
}
