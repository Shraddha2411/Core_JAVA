package MultiThreading;

public class ThreadDemo {
	public static void main(String[] args) {
		A oa1=new A(10,1,"FIRST");
        A oa2=new A(5,0,"SECOND");
        B ob=new B("THIRD");
        
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread();
       
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
        t1.join();
        t2.join();
        t3.join();
        }
        catch(Exception e)
        {
        }
        System.out.println("HAVE A NICE DAY");   
	}
	}
