package Generic;

public class GenericTest<T>
{
T obj;
void add(T obj)

{
	this.obj = obj;}
T get()
	{
		return obj;
	}


	

	public static void main(String[] args) {
		GenericTest<Integer> obj= new GenericTest<Integer>();
		obj.add(2);
	System.out.println(obj.get());
	
	GenericTest<String> obj1=new GenericTest<String>();
	
	obj1.add("Hello");
	System.out.println(obj1.get());
	
	
	
	}

}
