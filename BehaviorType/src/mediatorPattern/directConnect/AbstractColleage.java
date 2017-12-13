package mediatorPattern.directConnect;

public abstract class AbstractColleage {

	protected int number;
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}
	//抽象方法，修改数字同时修改关联对象
	public abstract void setNumber(int number,AbstractColleage coll);
}
