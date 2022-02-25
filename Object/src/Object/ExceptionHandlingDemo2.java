package Object;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		int a=45;
		int b=0;
		try {
			int[] arr= new int[3];
			 arr[3]=35;
			//int c=a/b;
			System.out.println("In try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			ae.printStackTrace();
			System.out.println("Exception in try block");
		}
		//catch (Arithmetic Exception ae)
		//System.out.println("Exception in try block");
		finally
		{
			System.out.println("In finally block");
		    System.out.print("In the class");
		}

	}

}
