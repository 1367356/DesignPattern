package decoratorPattern.concreteExample;

public class Change implements TheGreatestSage{

	private TheGreatestSage sage;
	
	public Change(TheGreatestSage sage) {
		// TODO Auto-generated constructor stub
		this.sage=sage;
	}
	public void move(){
		sage.move();
	}

}
