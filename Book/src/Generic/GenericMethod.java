package Generic;

public class GenericMethod {
	public <E> void displayArrayElements(E[] elements)
	{
		for(E element: elements)
		{
			System.out.println("Elements is:" +element);
		}
	}

	public static void main(String[] args) {
		GenericMethod obj =new GenericMethod();
		Integer[] intarray= {10,20,30,40};
		String[] str= {"java","programming","learning"};
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);
	}

}
