package annotations;
import java.lang.annotation.Annotation;
@Animal()
class Animal_Carnivorus
{
	String name;
	String type; 
	int legs;
	public Animal_Carnivorus(String name,String type) {
		this.name=name;
		this.type=type;
		
	}
}
public class AnnnotationDemo {

	public static void main(String[] args) {
		Animal_Carnivorus obj=new Animal_Carnivorus("Cat", "Domestic");
		
		System.out.println(obj.name);
		System.out.println(obj.type);
		System.out.println(obj.legs);

	}

}
