package decoratorPattern.concreteExample;

public class Fish extends Change{

	public Fish(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}
	public void move(){
		System.out.println("Fish Move");
	}
	
}
