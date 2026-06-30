package Day2;

import java.util.Arrays;
import java.util.List;

public class FirstStreamDemo {
	public static void print(Object obj)
	{
		System.out.println(obj);
	}
	
	public static int add(int a,int b)
	{
		return a+b;
	}
	
	public static void main(String[] args)
	{
		Integer[] ar= {2,5,7,6,9,3,2,4};
		List<Integer>numbers=Arrays.asList(ar);
		
		for(int n:numbers)
				System.out.println(n);
		
		Stream<Integer>str1= numbers.stream()
	}

}