package mediatorPattern.mediatorConnect;

public class ColleagueB extends AbstractColleague{

	@Override
	public void setNumber(int number, Abstractmediator am) {
		// TODO Auto-generated method stub
		this.number=number;
		am.BaffectA();
	}

}
