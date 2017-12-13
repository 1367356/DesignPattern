package decoratorPattern.concreteExample;

public class Bird extends Change{

	public Bird(TheGreatestSage sage) {
		super(sage);
		// TODO Auto-generated constructor stub
	}

	public void move(){
		System.out.println("Bird Move");
	}
}
