package mediatorPattern.mediatorConnect;

public class Mediator extends Abstractmediator{

	public Mediator(AbstractColleague a, AbstractColleague b) {
		super(a, b);
		// TODO Auto-generated constructor stub
	}

	//����A��B��Ӱ��
	public void AaffectB() {
		// TODO Auto-generated method stub
		int number=A.getNumber();
		B.setNumber(number*100);
	}

	//����B��A��Ӱ��
	public void BaffectA() {
		// TODO Auto-generated method stub
		int number=B.getNumber();
		A.setNumber(number/100);
	}

}
