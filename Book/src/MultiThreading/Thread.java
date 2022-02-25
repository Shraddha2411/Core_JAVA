package MultiThreading;

public class Thread {
	public static void main(String[] args) {
		Example thread1 = new Example("First", 2000);
		Example thread2 = new Example("Second", 3000);

		thread1.start();
		thread2.start();
		try {
			thread1.join();
			thread2.join();
		}

		catch (Exception e) {

		}
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep1(i);
			} catch (Exception e) {

			}
			System.out.println("main" + i);
		
		}
	}

	protected static void sleep(int i) {
		// TODO Auto-generated method stub
		
	}

	public static void sleep1(int i) {
		// TODO Auto-generated method stub
		
	}

	public void run() {
		// TODO Auto-generated method stub
		
	}

	public void start() {
		// TODO Auto-generated method stub
		
	}

	public void join() {
		// TODO Auto-generated method stub
		
	}
}
	