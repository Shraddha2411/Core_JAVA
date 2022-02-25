package Object;

public class Box {
	float width;
	float height;
	float depth;
	
	float calvol() {
		return width*height*depth;
	}

	public static void main(String[] args) {
		
		Box box1=new Box();
		box1=new Box();
		box1.width=3.4f;
		box1.height=2.2f;
		box1.depth=1.4f;
		float volume =box1.calvol();
		
		System.out.println("Volume of Box1 is:"+volume);
	}

}
