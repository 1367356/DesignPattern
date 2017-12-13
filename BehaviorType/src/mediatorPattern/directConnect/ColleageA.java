package mediatorPattern.directConnect;

public class ColleageA extends AbstractColleage{

	@Override
	public void setNumber(int number, AbstractColleage coll) {
		// TODO Auto-generated method stub
		this.number=number;
		coll.setNumber(number*100);
	}

}
