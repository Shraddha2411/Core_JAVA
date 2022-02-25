package Object;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		int[] arr= new int[4];
		int a=45;
		int b=0;
		try {
			arr[4]=35;
			int c=a/b;
			{
				System.out.println("In the try block");
			}
		}
		catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("Exception in try block");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("In finally block");
			System.out.println("In th class");
		}
	}

}
