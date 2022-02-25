package Syncronization;
public class DepositThread extends Thread {
	AClass obj;
	int amt;
	String msg;
	private Object office;
	
	public DepositThread(AClass obj, int amt,String msg) {	
		this.obj = obj;
		this . office = office;
		this.msg=msg;
	}

	@Override
	public  void  run () {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("First");
		obj . deposit (amt);
	}
	

}

