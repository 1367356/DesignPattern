package mediatorPattern.mediatorConnect;

public abstract class AbstractColleague {

	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//ע���������������ͬ���࣬����һ���н���
	public abstract void setNumber(int number,Abstractmediator am);

	
}
