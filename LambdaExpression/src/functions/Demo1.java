package functions;

import java.util.function.Function;

public class Demo1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> f=n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(10));
		System.out.println(f.apply(2));
		
		//String length
		
		//string as parameter and find length of string and return type integer as output
		
		Function<String,Integer> fn=s->s.length();
		
		System.out.println(fn.apply("Welcome"));
		System.out.println(fn.apply("Java Programming"));
		
	}

}
