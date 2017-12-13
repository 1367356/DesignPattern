package mediatorPattern.mediatorConnect;

public abstract class Abstractmediator {

	protected AbstractColleague A;
	protected AbstractColleague B;
	public Abstractmediator(AbstractColleague a, AbstractColleague b) {
		super();
		A = a;
		B = b;
	}
	public abstract void AaffectB();
	public abstract void BaffectA();
}
