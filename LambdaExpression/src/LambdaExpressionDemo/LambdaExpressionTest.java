package LambdaExpressionDemo;


// Example 1 

/*@FunctionalInterface

interface Cab
{
	public void bookCab();
}

class Ola implements Cab
{
	public void bookCab()
	{
		System.out.println("Ola cab is bookes...");
	}
	
	()->System.out.println("Ola cab is bookes...");
}


public class LambdaExpressionTest {

	public static void main(String[] args) {
	
		//Cab cab=new Ola();
		Cab cab=()->System.out.println("Ola cab is bookes...");
		cab.bookCab();

	}

}*/


// Example 2

/*interface Cab
{
	public void bookCab(String source, String destination);
}

/*class Ola implements Cab

{
	public void bookCab(String source, String destination)
	{
		System.out.println("Ola cab booked from"+source+"To"+destination);
	}
}

public class LambdaExpressionTest
{
	public static void main(String[] args) 
	{
      //Cab cab=new Ola();
		Cab cab=(source, destination)->System.out.println("Ola cab booked from"+source+"To"+destination);
      cab.bookCab("Pune", "Mumbai");
	}
}*/

//Example 3

interface Cab
{
	public String bookCab(String source, String destination);
}

/*class Ola implements Cab

{
	public String bookCab(String source, String destination)
	{
		System.out.println("Ola cab booked from"+source+"To"+destination);
		return ("Price:5000");
	}
}*/


public class LambdaExpressionTest
{
	public static void main(String[] args) 
	{
      //Cab cab=new Ola();
		
		Cab cab=(source, destination)->
		{
			System.out.println("Ola cab booked from"+source+"To"+destination);
			return ("Price:5000");
		};
		
      System.out.println(cab.bookCab("Pune", "Mumbai"));
		
	}
}
