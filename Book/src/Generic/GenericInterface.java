package Generic;
interface MinMax<T extends Comparable<T> >{
	T min();
	T max();
	
}

public class GenericInterface<T extends Comparable <T> >
implements MinMax<T> 
{ T [] values;
GenericInterface( T [] obj)
{
	values=obj;
	
}

	@Override
public T min() {
	T ol=values[0];
	for (int i=1;i<values.length;i++)
		if(values[i].compareTo(ol)<0)
			ol=values[i];
	return ol;
}

@Override
public T max() {
	T ol=values[0];
	for (int i=1;i<values.length;i++)
		if(values[i].compareTo(ol)>0)
			ol=values[i];
	return ol;
}

	public static void main(String[] args) {
		Integer arr[]= {3,6,2,8,6};
		GenericInterface<Integer> obj=new GenericInterface<Integer>(arr);
		System.out.println("Minumum value is:"+obj.min());
		System.out.println("Maximum value is:"+obj.max());
		
	}

}
