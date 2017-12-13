package mediatorPattern.mediatorConnect;

public class Mediator extends Abstractmediator{

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	//处理A对B的影响
	public void AaffectB() {
		// TODO Auto-generated method stub
		int number=A.getNumber();
		B.setNumber(number*100);
	}

	//处理B对A的影响
	public void BaffectA() {
		// TODO Auto-generated method stub
		int number=B.getNumber();
		A.setNumber(number/100);
	}

}
