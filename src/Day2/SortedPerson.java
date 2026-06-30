package Day2;

import java.util.TreeSet;

public class SortedPerson {
	
	public static void main(String[] args)
	{
		TreeSet<person> people=new TreeSet<person>();
		people.add(new person("Polo" ,24));
		people.add(new person("Mona" ,31));
		people.forEach(System.out::println);
		
		
	}

}