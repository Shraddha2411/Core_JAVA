package Object;

public class StaticDemo {
	int a=10;
	int b;
	static int c=25;
	void func1()
	{
		System.out.println("The Value are:");
		System.out.println("a value is:"+a);
		System.out.print("b value is:"+b);
		System.out.println("c value is:"+c);
		
	}

static void func2()
	{
		int d=19;
		int e=20;
		System.out.println("d value is:"+d);
		System.out.println("e value is:"+e);
	}
	StaticDemo ()
	{
		System.out.println("Hello I am Static Block");
	} 
	public static void main(String[] args) {
		System.out.println("c value is:"+ StaticDemo.c);
			StaticDemo obj=new StaticDemo();
		obj.func1();
		StaticDemo.func2();
	}

	}


