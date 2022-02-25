package Object;

public class WrapperClassDemo {

	public static void main(String[] args) {
		//unboxing
		Integer i=new Integer(10);
		System.out.println(i);
		int b=i.intValue();
		System.out.println(b);
		
		//outbxing
		int a=200;
		Integer i1=a;
		System.out.println(i1);
		Character ch='a';
		char c=ch;
		

	}

}
