package Generic;
import java.util.Arrays;
import java.util.List;
public class UnboundedWildCard {
public static void display(List<?>ll)
{
	for(Object o:ll)
	{
		System.out.println(o);
	}
}
	public static void main(String[] args) {
		List<Integer>ll=Arrays.asList(1,2,3);
		System.out.println("Display values:");
			display(ll);
		
	
	List<String>l2=Arrays.asList("Hi", "Hello" ,"How are you");
	System.out.println("display values");
	display(l2);
	}
	
		
	}


