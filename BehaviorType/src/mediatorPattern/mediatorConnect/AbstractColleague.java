package mediatorPattern.mediatorConnect;

public abstract class AbstractColleague {

	protected int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//注意这里参数不再是同事类，而是一个中介者
	public abstract void setNumber(int number,Abstractmediator am);

	
}
