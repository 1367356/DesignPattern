package mediatorPattern.directConnect;

public abstract class AbstractColleage {

	protected int number;
	public int getNumber(){
		return number;
	}
	public void setNumber(int number){
		this.number=number;
	}
	//���󷽷����޸�����ͬʱ�޸Ĺ�������
	public abstract void setNumber(int number,AbstractColleage coll);
}