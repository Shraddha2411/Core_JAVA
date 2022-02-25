package Object;

abstract class Bank {
	abstract float getRateofInterest();
	void display()
	{
		System.out.println("Abstract Class");
		
	}

}

class SBI extends Bank{
	float getRateofInterest() {
		return 7.0f;
	}
}
class HDFC extends Bank{
	float getRateofInterest() {
		return 5.0f;
	}
}