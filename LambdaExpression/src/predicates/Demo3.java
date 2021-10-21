package predicates;

import java.util.function.Predicate;

//Joining Predicates-and, or, negate
//p1---> checks number is even 
//p2---> checks greater than 50


public class Demo3 {

	public static void main(String[] args) {
		
		int a[]={5,15,20,25,30,35,40,50,55,60,65};
		
		Predicate<Integer> p1= i->i%2==0;
		Predicate<Integer> p2= i->i>50;
		
		//and-->join the predicate
		
		/*System.out.println("Following are numbers Even & Greater than 50");
		
		for(int n:a)
		{
			//if(p1.test(n) && p2.test(n))
			if(p1.and (p2).test(n)) // joining of predicates
			{
				System.out.println(n); //60
			}
		}*/
		
		//or-->join the predicate
		
		/*for(int n:a)
		{
			//if(p1.test(n) && p2.test(n))
			if(p1.or (p2).test(n)) // joining of predicates
			{
				System.out.println(n);//20 30 40 50 55 60 65

			}
		}*/
		
		//negate-->opposite of the expression
		
		for(int n:a)
		{
			//if(p1.test(n) && p2.test(n))
			if(p1.negate().test(n)) //5 15 25 35 55 65
			{
				System.out.println(n);

			}
		}
	}

}
