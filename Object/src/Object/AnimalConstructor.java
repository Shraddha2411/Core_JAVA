package Object;

public class AnimalConstructor {
	int legs;
	String name;
	String color;
	
	public AnimalConstructor()
	{
		System.out.println("This is default constructor");
	}
	public AnimalConstructor(String name)
	{
		this();
		this.name=name;
	}
	public AnimalConstructor(int legs, String name, String color)
	{
		this.legs= legs;
	}
	void display()
	{
		System.out.println("Animal Decription:");

		System.out.println("Color"+color+ "Name"+name+ "with" +"legs"+legs);
		
	}

	public static void main(String[] args) {
		AnimalConstructor obj1=new AnimalConstructor(4, "cat","white");
		obj1.display();
		AnimalConstructor obj2=new AnimalConstructor(4,"Dog","Black");
		obj2.display();
		
				

	}

}
