package predicates;

import java.util.function.Predicate;

//Predicate-->one parameter and returns boolean
// Use only if you have conditional checks in your program..

public class Demo1
{

	public static void main(String[] args)
	{
	
		// Example 1
		
		Predicate<Integer> p=i->(i>10);// p is ref. variable & i is an arg.
		
		System.out.println(p.test(20));// true
		System.out.println(p.test(5));//false
		
		// Example 2 Check length of given string is >4 or not
		
		Predicate<String> pr=s->(s.length()>4);
		
		System.out.println(pr.test("welcome"));// true
		System.out.println(pr.test("xyz"));// false
		
		// Example 3
		
		String names[]= {"David","Scott","Smith","John","Mary"};
		
		for(String name:names)
		{
           if(pr.test(name)) // invoking lambda expression(Ex.2) using test()
           {
        	   System.out.println(name);//David Scott Smith
           }
           
           /*if(name.length()>4)
           {
        	   System.out.println(name);//David Scott Smith
           }*/
		}
	}
}
